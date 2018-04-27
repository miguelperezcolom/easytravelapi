<template>
<div>
  <form method="get" v-on:submit="buscar">

    <div class="input-field inline">
      <!--
      <i class="material-icons prefix">textsms</i>
      -->
      <input type="text" id="destino" class="autocomplete validate" v-model="destino" v-on:keyup="buscardestino">
      <label for="destino" data-error="wrong" data-success="right">Destino</label>
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
      <input id="ocupacion" type="text" class="validate" v-model="parametros.ocupacion">
      <label for="ocupacion" data-error="wrong" data-success="right">Ocupación</label>
    </div>

    <div class="input-field inline">
      <a class="waves-effect waves-light btn" v-on:click="buscar">Buscar</a>
    </div>

  </form>
</div>
</template>

<script>
    import axios from 'axios';

    var baseurl = 'http://localhost:9998/xxx';
    var lan = 'es';

    var instance;
    var opciones;

    export default {
        name: "Formulario"
      , data: function() {
          return {
            destino: 'Ibiza',
            iddestino: null,
            entrada: '2018-06-01',
            salida: '2018-06-08',
            parametros: {
              checkin: 'aaa',
              checkout: 'bbbb',
              ocupacion: '1x2'
            }
          }
      }
      , methods: {
          buscardestino: function(e) {

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
                url: baseurl + '/commons/search',
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
            this.$router.push({ name: 'hotel_dispo', query: {destino: this.$data.iddestino, checkin: this.$data.parametros.checkin, checkout: this.$data.parametros.checkout, ocupacion: this.$data.parametros.ocupacion} });
          }
      }
      , mounted () {
          var d = this.$data;
        var elem = document.querySelector('.autocomplete');
        instance = M.Autocomplete.init(elem, {
          data: {
            "Apple": null,
            "Microsoft": null,
            "Google": 'https://placehold.it/250x250'
          },
          onAutocomplete: function(e) {
            console.log(e);
            for (var x in opciones) {
              console.log(opciones[x]);
              if (opciones[x].name == e) {
                console.log('destino encontrado');
                d.iddestino = opciones[x].resourceId;
                break;
              }
            }
          },
          selectOption(e) {
            console.log(e);
          }
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
