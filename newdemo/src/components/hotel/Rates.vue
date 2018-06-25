<template>

  <div>
    <h1>Choose your rooms</h1>

    <ul class="collection with-header" v-if="rates">
      <li class="collection-header"><h4>{{ rates.msg }}</h4></li>
      <li class="collection-item"v-for="ocupacion in rates.rates"><div>{{ ocupacion.numberOfRooms }} x {{ ocupacion.paxPerRoom }} ({{ ocupacion.ages }}):</div>
        <div>
          <select v-model="ocupacion.seleccionado">
            <template v-for="aloc in ocupacion.options">
              <option v-for="price in aloc.prices" :value="price.key">{{ aloc.roomName }} {{ price.boardBasisName }} <template v-if="price.retailPrice">{{ price.retailPrice.value }} {{ price.retailPrice.currencyIsoCode }}</template>
                <template v-else>{{ price.netPrice.value }} {{ price.netPrice.currencyIsoCode }}</template></option>
            </template>
          </select>
        </div>
      </li>
    </ul>

    <a class="waves-effect waves-light btn" v-on:click="abrirdetalle">Go on</a>

  </div>


</template>

<script>

  import axios from 'axios';

  var lan = 'es';

    export default {
        name: "Rates"
      , data: function() {
        return {
          rates:null,
        }
      }
      , methods: {
          abrirdetalle: function(e) {
            console.log('------------------');
            var s;
            for (var z in this.$data.rates.rates) {
              if (s) s += ',';
              else s = '';
              s += this.$data.rates.rates[z].seleccionado;
            }
            this.$router.push({ name: 'hotel_detalle', query: {keys: s} });
          }
      }
      , mounted() {
        console.log(this.$route.query);

        var d = this.$data;

        axios({
          method: 'post',
          url: globaldata.baseurl + '/hotel/rates/' + this.$route.query.hotelkey,
          params: {
z
          }
        })
          .then(function (response) {
            console.log(response.data);
            for (var z in response.data.rates) {
              response.data.rates[z].seleccionado = response.data.rates[z].options[0].prices[0].key;
            }

            d.rates = response.data;


            //Vue.set(vm, 'dispo.data', response.data)
            setTimeout(function() {
              console.log(d.opciones);

              var elems = document.querySelectorAll('select');
              var instances = M.FormSelect.init(elems, {});
            });
          })
          .catch(function (error) {
            console.log(error);
          });

      }
    }
</script>

<style scoped>

  a.btn {
    position: absolute;
    left: 50%;
    transform: translateX(-50%);
  }

</style>
