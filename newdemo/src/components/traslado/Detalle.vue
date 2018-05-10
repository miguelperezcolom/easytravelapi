<template>

  <div>
    <h1>Almost done</h1>

    <div v-if="detalles">

      <form>

        <div class="row">

          <div class="col m3 s12">

            <div class="row">

              <div class="col m12 s12">
                <h4>Remarks</h4>
                <div v-for="r in detalles.remarks">
                  <p>{{ r.text }}</p>
                </div>
              </div>
            </div>


            <div class="row">

              <div class="col m12 s12">

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
                    <td class="right">{{ c.net.value }} {{ c.net.currencyIsoCode}}</td>
                  </tr>
                  </tbody>
                </table>

              </div>

            </div>



          </div>

          <div class="col offset-m1 m4 s12">

            <div class="row">
              <div class="col s12">

                <h4>Please fill</h4>

                <div>
                  <label for="to">Touroperator</label>
                  <input type="text" id="to" placeholder="Enter your name" v-model="touroperador">
                </div>
                <div>
                  <label for="name">Lead name</label>
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

          <div class="col offset-m1 m3 s12 pago">

            <div class="row">

              <div class="col m12 s12">
                <h4>Totals</h4>

                <div class="row">
                  <div class="col m3 s3">Method</div>
                  <div class="col m3 s3">Currency</div>
                  <div class="col m3 s3">Paid</div>
                  <div class="col m3 s3">EUR</div>
                </div>

                <div class="row" v-for="m in detalles.paymentMethods">
                  <div class="col m3 s3"><p>{{ m.name }}</p></div>
                  <div class="col m3 s3"><p>{{ m.currencyIsoCode }}</p></div>
                  <div class="col m3 s3"><input type="number" v-model="m.value"/></div>
                  <div class="col m3 s3"><p class="right">35.12</p></div>
                </div>

                <div class="row">
                  <div class="col m8 s8"><p class="right">Paid</p></div>
                  <div class="col m4 s4"><p class="right">35.12</p></div>
                </div>

                <div class="row">
                  <div class="col m8 s8"><p class="right">Total</p></div>
                  <div class="col m4 s4"><p class="right">35.12</p></div>
                </div>

                <div class="row">
                  <div class="col m8 s8"><p class="right">Balance</p></div>
                  <div class="col m4 s4"><p class="right">35.12</p></div>
                </div>

              </div>
            </div>

            <div class="row">
              <div class="col m12 s12 center">

                <br><br>
                <a class="waves-effect waves-light btn" v-on:click="book">BOOK</a>
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
        touroperador: null,
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
          url: globaldata.baseurl + '/transfer/booking',
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
        url: globaldata.baseurl + '/transfer/pricedetails/' + this.$route.query.keys,
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

  .pago p{margin: 0px;}

  .pago input {
    height: 1em !important;
  }

  .pago .row {
    margin-bottom: 5px;
  }

</style>
