<template>

  <div v-if="dispo">


    <ul class="collection with-header">
      <li class="collection-header"><h4>{{ dispo.msg }}</h4></li>
      <a v-on:click="abrirdetalle(hotel.hotelKey)" v-for="hotel in dispo.hotels" style="cursor: pointer;"><li class="collection-item"><div>{{ hotel.hotelName }}<a class="secondary-content">{{ hotel.bestDeal.retailPrice.value }} {{ hotel.bestDeal.retailPrice.currencyIsoCode }}</a></div></li></a>
    </ul>

  </div>

</template>

<script>

  import axios from 'axios';

  var lan = 'es';


    export default {
        name: "HotelDispo"
      , data: function() {
        return {
          dispo:null,
        }
      }
      , methods: {
          abrirdetalle(k) {
            console.log(k);
            this.$router.push({ name: 'hotel_rates', query: {hotelkey: k} });
          }
      }
      , mounted() {
        console.log(this.$route.query);

        var d = this.$data;

        axios({
          method: 'get',
          url: globaldata.baseurl + '/hotel/available',
          params: {
            language: lan,
            resorts: this.$route.query.destino,
            checkin: this.$route.query.entrada?this.$route.query.entrada.replace(/-/g, ""):null,
            checkout: this.$route.query.salida?this.$route.query.salida.replace(/-/g, ""):null,
            occupancies: this.$route.query.ocupacion,
          }
        })
          .then(function (response) {
            console.log(response.data);
            d.dispo = response.data;
            //Vue.set(vm, 'dispo.data', response.data)
          })
          .catch(function (error) {
            console.log(error);
          });

      }
    }
</script>

<style scoped>

</style>
