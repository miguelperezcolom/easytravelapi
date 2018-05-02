<template>

  <div>
    <h1>Choose your supplements and fill</h1>

    <div v-if="detalles" class="row">

      <form>


      <div>

        <h2 v-if=" detalles.retail">Total retail {{ detalles.retail.value }} {{ detalles.retail.currencyIsoCode}}</h2>
        <h2 v-if=" detalles.commission">Total comission {{ detalles.commission.value }} {{ detalles.commission.currencyIsoCode}}</h2>
        <h2 v-if=" detalles.net">Total net {{ detalles.net.value }} {{ detalles.net.currencyIsoCode}}</h2>

        <div>

          <p>Available supplements:</p>

          <table>
            <thead>
            <tr>
              <th>#</th>
              <th>Description</th>
              <th>Cost</th>
              <th width="60">Selected</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="c in detalles.availableServices">
              <th scope="row">{{ c.id }}</th>
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


        <div v-for="r in detalles.remarks">
          {{ r.text }}
        </div>


        <hr>

        <p>Cancellation costs</p>

        <table>
          <thead>
          <tr>
            <th>#</th>
            <th>After</th>
            <th>Cost</th>
          </tr>
          </thead>
          <tbody>
          <tr v-for="c in detalles.cancellationCosts">
            <th scope="row">1</th>
            <td>{{c.gmttime}}</td>
            <td>{{ c.net.value }} {{ c.net.currencyIsoCode}}</td>
          </tr>
          </tbody>
        </table>


      </div>


      <div>


          <div>
            <label for="name">Your name</label>
            <input type="text" id="name" placeholder="Enter your name" v-model="titular">
          </div>
          <div>
            <label for="comentarios">Special requests</label>
            <textarea id="comentarios" placeholder="If you have any" v-model="comentarios"></textarea>
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

  var baseurl = 'http://localhost:9998/xxx';
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
              url: baseurl + '/hotel/booking',
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
          url: baseurl + '/hotel/pricedetails/' + this.$route.query.keys,
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
