<template>

  <div>
    <h1>Choose your supplements and fill</h1>

    <div v-if="detalles">

      <form>


      <div class="row">

        <div class="col m6 s12">
          <h4>Totals</h4>
          <table>
            <thead>
            <tr>
              <th>Description</th>
              <th>Cost</th>
            </tr>
            </thead>
            <tbody>
            <tr v-if=" detalles.retail"><td>Retail</td><td> {{ detalles.retail.value }} {{ detalles.retail.currencyIsoCode}}</td></tr>
            <tr v-if=" detalles.commission"><td>Comission</td><td> {{ detalles.commission.value }} {{ detalles.commission.currencyIsoCode}}</td></tr>
            <tr v-if=" detalles.net"><td>Net</td><td> {{ detalles.net.value }} {{ detalles.net.currencyIsoCode}}</td></tr>
            </tbody>
          </table>
        </div>


        <div class="col m6 s12">

          <h4>Available supplements:</h4>

          <table>
            <thead>
            <tr>
              <th>Description</th>
              <th>Cost</th>
              <th width="60">Selected</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="c in detalles.availableServices">
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

      </div><div class="row">

        <div class="col m6 s12">
          <h4>Remarks</h4>
          <div v-for="r in detalles.remarks">
          {{ r.text }}
        </div></div>




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


      <div class="col s12">

        <h4>Please fill</h4>

          <div>
            <label for="name">Your name</label>
            <input type="text" id="name" placeholder="Enter your name" v-model="titular">
          </div>
          <div>
            <label for="comentarios">Special requests</label>
            <textarea id="comentarios" placeholder="If you have any" v-model="comentarios"></textarea>
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
          titular: null,
          comentarios: null,
        }
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
          url: globaldata.baseurl + '/hotel/pricedetails/' + this.$route.query.keys,
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
