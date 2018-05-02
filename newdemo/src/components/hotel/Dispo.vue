<template>

  <div v-if="dispo">


    <ul class="collection with-header">
      <li class="collection-header"><h4>{{ dispo.msg }}</h4></li>
      <li class="collection-item"v-for="hotel in dispo.hotels"><div>{{ hotel.hotelName }}<a v-on:click="abrirdetalle" class="secondary-content" :data-hotelkey="hotel.hotelKey">{{ hotel.bestDeal.retailPrice.value }} {{ hotel.bestDeal.retailPrice.currencyIsoCode }}</a></div></li>
    </ul>

  </div>

</template>

<script>

  import axios from 'axios';

  var baseurl = 'http://localhost:9998/xxx';
  var lan = 'es';


    export default {
        name: "HotelDispo"
      , data: function() {
        return {
          dispo:null,
        }
      }
      , methods: {
          abrirdetalle(e) {
            console.log(e.srcElement.getAttribute("data-hotelKey"));
            this.$router.push({ name: 'hotel_rates', query: {hotelkey: e.srcElement.getAttribute("data-hotelKey")} });
          }
      }
      , mounted() {
        console.log(this.$route.query);

        var d = this.$data;

        axios({
          method: 'get',
          url: baseurl + '/hotel/available',
          params: {
            language: lan,
            resorts: this.$router.destino,
            checkin: this.$router.entrada,
            checkout: this.$router.salida,
            occupancies: this.$router.ocupacion,
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
