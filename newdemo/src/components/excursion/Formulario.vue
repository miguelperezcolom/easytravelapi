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
      <label for="entrada" data-error="wrong" data-success="right">Inicio vacaciones</label>
    </div>

    <div class="input-field inline">
      <input id="salida" type="date" class="validate" v-model="salida">
      <label for="salida" data-error="wrong" data-success="right">Fin vacaciones</label>
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
          <li v-for="pais in portfolio.countries">
            <template v-if="pais.name"><a v-on:click="seleccionardestino" :data-key="pais.resourceId" :data-name="pais.name.en">{{ pais.name.en }}</a>

            <ul class="browser-default">
              <li v-for="prov in pais.states"><template v-if="prov.name"><a v-on:click="seleccionardestino" :data-key="prov.resourceId" :data-name="prov.name.en">{{ prov.name.en }}</a>

                <ul class="browser-default">

                  <li v-for="loc in prov.cities"><template v-if="loc.name"><a v-on:click="seleccionardestino" :data-key="loc.resourceId" :data-name="loc.name.en">{{ loc.name.en }}</a>

                    <!--
                    <ul class="browser-default">

                      <li v-for="hot in loc.resources"><a v-on:click="seleccionardestino" :data-key="hot.resourceId" :data-name="hot.name.en">{{ hot.name.en }}</a></li>

                    </ul>
  -->

                  </template>
                    <template v-else>FALTA EL NOMBRE DE LA CIUDAD {{ loc }}</template>

                  </li>

                </ul>

              </template>
                <template v-else>FALTA EL NOMBRE DE LA PROVINCIA {{ prov }}</template>

              </li>
            </ul>

            </template>
            <template v-else>FALTA EL NOMBRE DEL PAIS {{ pais }}</template>

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
            idioma: 'es',
            portfolio: null,
            busqueda: null,
            coincidencias: {
              matches:[],
            },
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
            this.$router.push({ name: 'excursion_dispo', query: {destino: this.$data.iddestino, entrada: this.$data.entrada, salida: this.$data.salida, idioma: this.$data.idioma} });
          }
      }
      , mounted () {

        var d = this.$data;

        //var elems = document.querySelectorAll('.modal');
        M.Modal.init(document.querySelector('#modal1'), {});
        modal1 = M.Modal.getInstance(document.querySelector('#modal1'));

        M.updateTextFields();
        var elems = document.querySelectorAll('select');
        var instances = M.FormSelect.init(elems, {});


        axios({
          method: 'get',
          url: globaldata.baseurl + '/commons/portfolio'
        })
          .then(function (response) {
            console.log(d)
            d.portfolio = response.data;
            d.destino = d.portfolio.countries[0].states[0].name.en;
            d.iddestino = d.portfolio.countries[0].states[0].resourceId;
            console.log('destino ok');
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
