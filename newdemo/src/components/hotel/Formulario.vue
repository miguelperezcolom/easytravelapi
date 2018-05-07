<template>
<div>
  <form method="get" v-on:submit="buscar">

    <div class="input-field inline">
      <!--
      <i class="material-icons prefix">textsms</i>
      -->
      <input type="text" id="destino" class="autocomplete validate" v-model="destino" v-on:keyup="elegirdestino" v-on:focus="elegirdestino">
      <label for="destino" data-error="wrong" data-success="right">Destino</label>
    </div>

    <div class="input-field inline">
      <a class="btn-floating btn-small waves-effect waves-light blue" v-on:click="elegirdestino"><i class="material-icons">edit</i></a>
    </div>

    <div class="input-field inline">
      <input id="entrada" type="date" class="validate" v-model="entrada">
      <label for="entrada" data-error="wrong" data-success="right">Entrada</label>
    </div>

    <div class="input-field inline">
      <input id="salida" type="date" class="validate" v-model="salida">
      <label for="salida" data-error="wrong" data-success="right">Salida</label>
    </div>

    <div class="input-field inline">
      <input id="ocupacion" type="text" class="validate" v-model="ocupacion" v-on:keyup="elegirocupacion" v-on:focus="elegirocupacion">
      <label for="ocupacion" data-error="wrong" data-success="right">Ocupación</label>
    </div>

    <div class="input-field inline">
      <a class="btn-floating btn-small waves-effect waves-light blue" v-on:click="elegirocupacion"><i class="material-icons">edit</i></a>
    </div>

    <div class="input-field inline">
      <a class="waves-effect waves-light btn" v-on:click="buscar">Buscar</a>
    </div>

  </form>


  <!-- Modal Structure -->
  <div id="modal1" class="modal">
    <div class="modal-content">

      <div>
        <ul class="tabs" id="tabsdestino">
          <li class="tab col s3"><a class="active" href="#elegir">Choose destination</a></li>
          <li class="tab col s3"><a class="active" href="#buscar">Search destination</a></li>
        </ul>
      </div>
      <div id="elegir" class="col s12">

        <ul v-if="portfolio" class="browser-default">
          <li v-for="pais in portfolio.countries"><a v-on:click="seleccionardestino" :data-key="pais.resourceId" :data-name="pais.name.en">{{ pais.name.en }}</a>

            <ul class="browser-default">
              <li v-for="prov in pais.states"><a v-on:click="seleccionardestino" :data-key="prov.resourceId" :data-name="prov.name.en">{{ prov.name.en }}</a>

                <ul class="browser-default">

                  <li v-for="loc in prov.cities"><a v-on:click="seleccionardestino" :data-key="loc.resourceId" :data-name="loc.name.en">{{ loc.name.en }}</a>

                    <!--
                    <ul class="browser-default">

                      <li v-for="hot in loc.resources"><a v-on:click="seleccionardestino" :data-key="hot.resourceId" :data-name="hot.name.en">{{ hot.name.en }}</a></li>

                    </ul>
  -->

                  </li>

                </ul>

              </li>
            </ul>

          </li>
        </ul>

      </div>
      <div id="buscar" class="col s12">
        <div>
          <div class="input-field inline">
            <input id="busqueda" type="text" class="validate" v-model="busqueda" v-on:keyup="buscardestino">
            <label for="busqueda" data-error="wrong" data-success="right">Search text</label>
          </div>

          <div v-for="c in coincidencias.matches">
            <h5><a v-on:click="seleccionardestino" :data-key="c.resourceId" :data-name="c.name">{{ c.name }}</a></h5>

            {{ c.description }}
          </div>

        </div>
      </div>

    </div>
    <div class="modal-footer">
      <a class="modal-close waves-effect waves-green btn-flat">Agree</a>
    </div>
  </div>

  <div id="modal2" class="modal">
    <div class="modal-content">
      <h4>Change occupation</h4>
      <div class="container">
      <div v-for="(o, index) in ocupaciones">
        <div class="input-field inline">
          <input type="number" class="validate" v-model="o.habitaciones">
          <label v-if="index < 1" for="destino" data-error="wrong" data-success="right">Habitaciones</label>
        </div>
        <div class="input-field inline">
          <input type="number" class="validate" v-model="o.pax">
          <label v-if="index < 1" for="destino" data-error="wrong" data-success="right">Pax</label>
        </div>
        <div class="input-field inline">
          <input type="text" class="validate" v-model="o.edades">
          <label v-if="index < 1" for="destino" data-error="wrong" data-success="right">Edades niños</label>
        </div>
        <div class="input-field inline">
          <a class="btn-floating btn-small waves-effect waves-light red" v-on:click="borrarocupacion(index)"><i class="material-icons">delete</i></a>
        </div>
      </div>
      <div>

      <a class="btn-floating btn-small waves-effect waves-light green left" v-on:click="anadirocupacion"><i class="material-icons">add</i></a>
      </div>
      </div>
    </div>
    <div class="modal-footer">
      <a class="modal-close waves-effect waves-green btn-flat">Agree</a>
    </div>
  </div>

</div>
</template>

<script>
    import axios from 'axios';

    var lan = 'es';

    var instance;
    var opciones;

    var modal1;
    var modal2;

    export default {
        name: "Formulario"
      , data: function() {
          return {
            destino: '.',
            iddestino: null,
            entrada: '2018-06-01',
            salida: '2018-06-08',
            ocupacion: '1x2',
            portfolio: null,
            busqueda: null,
            coincidencias: {
              matches:[],
            },
            ocupaciones: [
              {
                habitaciones: 1,
                pax: 2,
                edades: null,
              }
            ],
          }
      }
      , methods: {
          elegirdestino: function(e) {
            modal1.open();
            M.Tabs.init(document.querySelector('#tabsdestino'), {});
          },
        seleccionardestino: function(e) {
            this.$data.destino = e.srcElement.getAttribute("data-name");
          this.$data.iddestino = e.srcElement.getAttribute("data-key");
          modal1.close();
        },
        elegirocupacion: function(e) {
          modal2.open();
        },
        borrarocupacion: function(index) {
            if (this.$data.ocupaciones.length > 1) this.$data.ocupaciones.splice(index, 1);
        },
        anadirocupacion: function(e) {
          this.$data.ocupaciones.push({habitaciones: 1, pax:2, edades:null,});
          M.updateTextFields();
        },
        buscardestino: function(e) {

          var especial = false;
          especial |= e.keyCode == 37;
          especial |= e.keyCode == 38;
          especial |= e.keyCode == 39;
          especial |= e.keyCode == 40;


          if (!especial) {

            console.log(e.keyCode);
            console.log(this.$data.busqueda);
            var coins = this.$data.coincidencias;

            axios({
              method: 'get',
              url: globaldata.baseurl + '/commons/search',
              params: {
                language: lan,
                query: this.$data.busqueda,
              }
            })
              .then(function (response) {
                console.log(response.data.matches);
                coins.matches = response.data.matches;
              })
              .catch(function (error) {
                console.log(error);
              });

          }

        },
          buscardestinox: function(e) {

            var especial = false;
            especial |= e.keyCode == 37;
            especial |= e.keyCode == 38;
            especial |= e.keyCode == 39;
            especial |= e.keyCode == 40;


            if (!especial) {

              console.log(e.keyCode);
              console.log(this.$data.destino);

              axios({
                method: 'get',
                url: globaldata.baseurl + '/commons/search',
                params: {
                  language: lan,
                  query: this.$data.destino,
                }
              })
                .then(function (response) {
                  console.log(response.data.matches);
                  var opts = {}
                  opciones = response.data.matches;
                  for (var m in opciones) {
                    opts[opciones[m].name] = null;
                  }
                  console.log(opts);
                  instance.updateData(opts);

                  //Vue.set(vm, 'dispo.data', response.data)
                })
                .catch(function (error) {
                  console.log(error);
                });

            }

          },
          buscar: function(e) {
            e.preventDefault();
            console.log(this.$data);
            this.$router.push({ name: 'hotel_dispo', query: {destino: this.$data.iddestino, checkin: this.$data.entrada, checkout: this.$data.salida, ocupacion: this.$data.ocupacion} });
          }
      }
      , mounted () {

        var d = this.$data;

        //var elems = document.querySelectorAll('.modal');
        M.Modal.init(document.querySelector('#modal1'), {});
        M.Modal.init(document.querySelector('#modal2'), {onCloseEnd: function() {
            console.log('closed');
            var s;
            for (var o in d.ocupaciones) {
              if (s) s += ',';
              else s = '';
              s += d.ocupaciones[o].habitaciones;
              s += 'x';
              s += d.ocupaciones[o].pax;
            }
            d.ocupacion = s;
          }});
        modal1 = M.Modal.getInstance(document.querySelector('#modal1'));
        modal2 = M.Modal.getInstance(document.querySelector('#modal2'));

        M.updateTextFields();


        axios({
          method: 'get',
          url: globaldata.baseurl + '/commons/portfolio',
          params: {
            language: lan,
          }
        })
          .then(function (response) {
            console.log(d)
            d.portfolio = response.data;
            d.destino = d.portfolio.countries[0].states[0].name.es;
            d.iddestino = d.portfolio.countries[0].states[0].resourceId;
          })
          .catch(function (error) {
            console.log(error);
          });


        }
    }
</script>

<style scoped>

  form {
    margin-top: 60px;
    text-align: center;
  }


</style>
