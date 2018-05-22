<template>

  <div v-if="dispo">


    <ul class="collection with-header">
      <li class="collection-header"><h4>{{ dispo.msg }}</h4></li>
      <a v-on:click="abrirdetalle(exc.key)" v-for="exc in dispo.availableTransfers" style="cursor: pointer;"><li class="collection-item"><div>{{ exc.description }}<a class="secondary-content">{{ exc.total.retailPrice.value }} {{ exc.total.retailPrice.currencyIsoCode }}</a></div></li></a>
    </ul>

  </div>

</template>

<script>

  import axios from 'axios';

  var lan = 'es';


    export default {
        name: "TrasladoDispo"
      , data: function() {
        return {
          dispo:null,
        }
      }
      , methods: {
          abrirdetalle(k) {
            console.log(k);
            this.$router.push({ name: 'traslado_detalle', query: {key: k} });
          }
      }
      , mounted() {
        console.log(this.$route.query);

        var d = this.$data;

        axios({
          method: 'get',
          url: globaldata.baseurl + '/transfer/available',
          params: {
            language: lan,
            resorts: this.$route.query.destino,
            checkin: this.$route.query.entrada?this.$route.query.entrada.replace(/-/g, ""):null,
            checkout: this.$route.query.salida?this.$route.query.salida.replace(/-/g, ""):null,
            language: this.$route.query.idioma,
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
