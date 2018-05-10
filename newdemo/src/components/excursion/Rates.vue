<template>

  <div>
    <h1>Configure your excursion</h1>

    <div v-if="detalles">

      <form>


        <div class="row">
          <div class="col m6 s12">

            <div class="row">

              <div class="col m8 s12">
                <label for="hotel">Hotel</label>
                <input type="text" id="hotel" placeholder="Hteles de la oficina del representante" v-model="hotel">
              </div>

              <div class="col m4 s12">
                <label for="idioma" data-error="wrong" data-success="right">Idioma</label>
                <select id="idioma" v-model="idioma">
                  <option value="es">Español</option>
                  <option value="en">Inglés</option>
                  <option value="de">Alemán</option>
                </select>
              </div>

            </div>

            <div class="row">

              <div class="col m6 s12">
                <label for="fecha">Date</label>
                <select id="fecha" v-model="fecha">
                  <option v-for="d in detalles.availableDates" v-bind:value="d">{{ d.date }} <template v-if="d.price">{{d.price.retailPrice.value}} {{ d.price.retailPrice.currencyIsoCode}}</template> </option>
                </select>
              </div>

              <div class="col m6 s12" v-if="fecha.variants && fecha.variants.length > 0">
                <label for="variante">Variant</label>
                <select id="variante" v-model="variante">
                  <option v-for="d in fecha.variants" v-bind:value="d">{{ d.name }} {{ d.price.retailPrice.value}} {{ d.price.retailPrice.currencyIsoCode}}</option>
                </select>
              </div>
              <div class="col m6 s12" v-else>
                <label for="novariante">Variant</label>
                <input id="novariante" type="text" disabled value="No variant available">
              </div>
            </div>

            <div class="row">

              <div class="col m4 s12" v-if="fecha.shifts && fecha.shifts.length > 0">
                <label for="turno">Turno</label>
                <select id="turno" v-model="turno">
                  <option v-for="d in fecha.shifts" v-bind:value="d">{{ d.name }} ({{ d.time }})</option>
                </select>

              </div>

              <div class="col m4 s12" v-else>
                <label for="noturno">Turno</label>
                <input id="noturno" type="text" disabled value="No shift available">
              </div>

            </div>

            <div class="row">

              <div class="col m2 s12">
                <label for="adultos">Adults</label>
                <input type="number" id="adultos" placeholder="Enter your name" v-model="adultos">
              </div>

              <div class="col m2 s12">
                <label for="ninos">Children</label>
                <input type="number" id="ninos" placeholder="Enter your name" v-model="ninos">
              </div>

              <div class="col m2 s12">
                <label for="bebes">Infants</label>
                <input type="number" id="bebes" placeholder="Enter your name" v-model="bebes">
              </div>

              <div class="col m2 s12">
                <label for="vehiculos">Vehicles</label>
                <input type="number" id="vehiculos" placeholder="Enter your name" v-model="vehiculos">
              </div>

            </div>

            <div class="row">
              <div class="col m12 s12">

                <table>
                  <thead>
                  <tr>
                    <th>Supplement</th>
                    <th>Cost</th>
                    <th width="60">Selected</th>
                  </tr>
                  </thead>
                  <tbody>
                  <tr v-for="c in detalles.supplements">
                    <td>{{c.description}}</td>
                    <td>{{ c.retailPrice.value }} {{ c.retailPrice.currencyIsoCode}}</td>
                    <td><select v-model="c.cantidad">
                      <option value="0">0</option>
                      <option value="1">1</option>
                      <option value="2">2</option>
                      <option value="3">3</option>
                      <option value="4">4</option>
                    </select></td>
                  </tr>
                  </tbody>
                </table>

              </div>
            </div>


          </div>
          <div class="col offset-m2 m4 s12">

            <div class="row" v-if="total">

              <div class="col m12 s12">
              <table>
                <thead>
                <tr>
                  <th>Description</th>
                  <th class="right">Value</th>
                </tr>
                </thead>
                <tbody>
                <tr v-if=" total.total.retailPrice"><td>Retail total</td><td class="right"> {{ total.total.retailPrice.value }} {{ total.total.retailPrice.currencyIsoCode}}</td></tr>
                <tr v-if=" total.total.commission"><td>Comission total</td><td class="right"> {{ total.total.commission.value }} {{ total.total.commission.currencyIsoCode}}</td></tr>
                <tr v-if=" total.total.netPrice"><td>Net total</td><td class="right"> {{ total.total.netPrice.value }} {{ total.total.netPrice.currencyIsoCode}}</td></tr>
                </tbody>
              </table>

                <hr>

              </div>
                <div class="col s12 center" v-if="total.available">
                  <br><br>
                  <i class="material-icons green small circle">done</i><br/>AVAILABLE
                  <br><br><br>
              <a class="waves-effect waves-light btn" v-on:click="book"> Go on</a>
                </div>
              <div class="col s12 center" v-else>
                <i class="material-icons red small circle">error</i><br/>NOT AVAILABLE
              </div>
              </div>



          </div>


        </div>

      </form>

    </div>



    <div class="cantidad"></div>


  </div>


</template>

<script>

  import axios from 'axios';

  var lan = 'es';


  export default {
        name: "Rates"
      , data: function() {
        return {
          idioma: 'es',
          touroperador: null,
          hotel: null,
          detalles:null,
          fecha:{
            shifts:[],
            variants: [],
          },
          adultos: 1,
          ninos: 0,
          bebes: 0,
          vehiculos: 0,
          turno: null,
          variante: null,
          titular: null,
          comentarios: null,
          total: null,
        }
      },
    watch: {
      fecha: function (val) {

        this.valorar();

        setTimeout(function() {
          var elems = document.querySelectorAll('select');
          var instances = M.FormSelect.init(elems, {});
        });
      },
      variante: function (val) { this.valorar(); },
      turno: function (val) { this.valorar(); },
      adultos: function (val) { this.valorar(); },
      ninos: function (val) { this.valorar(); },
      vehiculos: function (val) { this.valorar(); },
    }
      , methods: {

          valorar: function() {
            console.log("valorar")

            var d = this.$data;

            axios({
              method: 'get',
              url: globaldata.baseurl + '/activity/price/' + this.$route.query.keys,
              params: {

              }
            })
              .then(function (response) {
                console.log(response.data);
                d.total = response.data;
              })
              .catch(function (error) {
                console.log(error);
              });

          },

          procesar: function(response) {
            if (response.data.statusCode == 200) this.$router.push({ name: 'ok', query: {bookingId: response.data.bookingId } });
            else this.$router.push({ name: 'ko', query: {msg: response.data.msg } });
          },

          book: function(e) {

            this.$router.push({ name: 'excursion_detalle', query: {key: e.srcElement.getAttribute("data-key")} });

          }
      }
      , mounted() {
        console.log(this.$route.query);

        var d = this.$data;

        axios({
          method: 'get',
          url: globaldata.baseurl + '/activity/rates/' + this.$route.query.keys,
          params: {

          }
        })
          .then(function (response) {
            console.log(response.data);
            d.detalles = response.data;
            //Vue.set(vm, 'dispo.data', response.data)
            setTimeout(function() {
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

</style>
