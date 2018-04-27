<template>

    <ul class="collection with-header">
      <li class="collection-header"><h4>{{ rates.msg }}</h4></li>
      <li class="collection-item"v-for="rate in rates.rates"><div>{{ rate.allocation.roomName }}</div>


        <ul class="collection">
          <li class="collection-item"v-for="price in rate.prices"><div>{{ price.boardBasisName }}<a v-on:click="abrirdetalle" class="secondary-content" :data-hotelkey="price.key"><template v-if="price.retailPrice">{{ price.retailPrice.value }} {{ price.retailPrice.currencyIsoCode }}</template>
            <template v-else>{{ price.netPrice.value }} {{ price.netPrice.currencyIsoCode }}</template></a></div></li>
        </ul>

      </li>
    </ul>

</template>

<script>

  import axios from 'axios';

  var baseurl = 'http://localhost:9998/xxx';
  var lan = 'es';

    export default {
        name: "Detalle"
      , data: function() {
        return {
          rates:null,
        }
      }
      , methods: {
          abrirdetalle: function(e) {

          }
      }
      , mounted() {
        console.log(this.$route.query);

        var d = this.$data;

        axios({
          method: 'get',
          url: baseurl + '/hotel/rates/' + this.$router.hotelKey,
          params: {

          }
        })
          .then(function (response) {
            console.log(response.data);
            d.rates = response.data;
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
