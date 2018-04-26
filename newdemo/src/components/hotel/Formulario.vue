<template>
<div>
  <form method="get" v-on:submit="buscar">

    <div class="input-field inline">
      <!--
      <i class="material-icons prefix">textsms</i>
      -->
      <input type="text" id="destino" class="autocomplete validate" v-model="destino">
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

    <input type="submit" value="Buscar"/>
  </form>
</div>
</template>

<script>
    export default {
        name: "Formulario"
      , data: function() {
          return {
            destino: 'Ibiza',
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
          buscar: function(e) {
            e.preventDefault();
            console.log(this.$data);
            this.$router.push({ name: 'hotel_dispo', query: {checkin: this.$data.parametros.checkin, checkout: this.$data.parametros.checkout, ocupacion: this.$data.parametros.ocupacion} });
          }
      }
      , mounted () {
        var elem = document.querySelector('.autocomplete');
        var instance = M.Autocomplete.init(elem, {
          data: {
            "Apple": null,
            "Microsoft": null,
            "Google": 'https://placehold.it/250x250'
          },
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
