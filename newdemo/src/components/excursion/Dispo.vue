<template>

  <div v-if="dispo">


    <ul class="collection with-header">
      <li class="collection-header"><h4>{{ dispo.msg }}</h4></li>
      <a v-on:click="abrirdetalle" :data-key="exc.key" v-for="exc in dispo.availableActivities" style="cursor: pointer;"><li class="collection-item"><div>{{ exc.name }}<a class="secondary-content">{{ exc.bestDeal.retailPrice.value }} {{ exc.bestDeal.retailPrice.currencyIsoCode }}</a></div></li></a>
    </ul>

  </div>

</template>

<script>

  import axios from 'axios';

  var lan = 'es';


    export default {
        name: "ExcursionDispo"
      , data: function() {
        return {
          dispo:null,
        }
      }
      , methods: {
          abrirdetalle(e) {
            console.log(e.srcElement.getAttribute("data-key"));
            this.$router.push({ name: 'excursion_rates', query: {key: e.srcElement.getAttribute("data-key")} });
          }
      }
      , mounted() {
        console.log(this.$route.query);

        var d = this.$data;

        axios({
          method: 'get',
          url: globaldata.baseurl + '/activity/available',
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
