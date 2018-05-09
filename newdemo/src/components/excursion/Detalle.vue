<template>

  <div>
    <h1>Fill and confirm</h1>

    <div v-if="detalles">

      <form>

        <div class="row">

          <div class="col m6 s12">

            <div class="row">

              <div class="col m6 s12">
                <h4>Remarks</h4>
                <div v-for="r in detalles.remarks">
                  {{ r.text }}
                </div>
              </div>
            </div>


            <div class="row">

              <div class="col m6 s12">

                <h4>Cancellation costs</h4>

                <table>
                  <thead>
                  <tr>
                    <th>After</th>
                    <th>Cost</th>
                  </tr>
                  </thead>
                  <tbody>
                  <tr v-for="c in detalles.cancellationCosts">
                    <td>{{c.gmttime}}</td>
                    <td>{{ c.net.value }} {{ c.net.currencyIsoCode}}</td>
                  </tr>
                  </tbody>
                </table>

              </div>

            </div>

            <div class="row">
              <div class="col s12">

                <h4>Please fill</h4>

                <div>
                  <label for="name">Your name</label>
                  <input type="text" id="name" placeholder="Enter your name" v-model="titular">
                </div>
                <div>
                  <label for="habitacion">Room number</label>
                  <input type="text" id="habitacion" placeholder="Enter your room number" v-model="habitacion">
                </div>
                <div>
                  <label for="tel">Mobile</label>
                  <input type="text" id="tel" placeholder="Enter your mobile telephone number" v-model="telefono">
                </div>
                <div>
                  <label for="email">Email</label>
                  <input type="email" id="email" placeholder="Enter your email" v-model="email">
                </div>
                <div>
                  <label for="comentarios">Special requests</label>
                  <textarea id="comentarios" placeholder="If you have any" v-model="comentarios"></textarea>
                </div>


              </div>
            </div>

          </div>

          <div class="col m6 s12">

            <div class="row">

              <div class="col m12 s12">
                <h4>Totals</h4>
                <table>
                  <thead>
                  <tr>
                    <th>Description</th>
                    <th>Currency</th>
                    <th>Amount</th>
                    <th>EUR</th>
                  </tr>
                  </thead>
                  <tbody>
                  <tr v-for="m in detalles.paymentMethods"><td>{{ m.name }}</td><td>{{ m.currencyIsoCode }}</td><td><input type="number" v-model="m.value"/></td><td>35.21</td></tr>
                  </tbody>
                  <tr>
                    <th colspan="3">Total</th>
                    <th>23.15</th>
                  </tr>
                </table>
              </div>
            </div>


          </div>

        </div>







      </form>

    </div>

    <a class="waves-effect waves-light btn" v-on:click="book">BOOK</a>

    <div class="cantidad"></div>


  </div>


</template>

<script>

  import axios from 'axios';

  var lan = 'es';


  export default {
        name: "Detalle"
      , data: function() {
        return {
          detalles:null,
          fecha:{
            shifts:[],
            variants: [],
          },
          turno: null,
          variante: null,
          titular: null,
          comentarios: null,
          habitacion: null,
          telefono: null,
          email: null,
        }
      },
    watch: {
      fecha: function (val) {

        setTimeout(function() {
          var elems = document.querySelectorAll('select');
          var instances = M.FormSelect.init(elems, {});
        });
      },
    }
      , methods: {

          procesar: function(response) {
            if (response.data.statusCode == 200) this.$router.push({ name: 'ok', query: {bookingId: response.data.bookingId } });
            else this.$router.push({ name: 'ko', query: {msg: response.data.msg } });
          },

          book: function(e) {

            var esto = this;

            axios({
              method: 'put',
              url: globaldata.baseurl + '/hotel/booking',
              data: {
                key: this.$route.params.key,
                leadName: this.$data.titular,
                commentsToProvider: this.$data.comentarios,
              }
            })
              .then(function (response) {
                console.log(response.data);
                esto.procesar(response);

                //Vue.set(vm, 'dispo.data', response.data)
              })
              .catch(function (error) {
                console.log(error);
              });

          }
      }
      , mounted() {
        console.log(this.$route.query);

        var d = this.$data;

        axios({
          method: 'get',
          url: globaldata.baseurl + '/activity/pricedetails/' + this.$route.query.keys,
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

  a.btn {
    position: absolute;
    left: 50%;
    transform: translateX(-50%);
  }

</style>
