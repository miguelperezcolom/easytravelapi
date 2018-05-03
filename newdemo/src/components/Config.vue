<template>

  <div class="container">

    <h1>Config</h1>

  <form >

    <div class="input-field inline" style="width: 100%;">
      <!--
      <i class="material-icons prefix">textsms</i>
      -->
      <input type="text" id="baseurl" class="validate" v-model="u">
      <label for="baseurl" data-error="wrong" data-success="right">Base URL</label>
    </div>


    <div class="input-field inline">
      <a class="waves-effect waves-light btn" v-on:click="set('http://test.easytravelapi.com/rest/yourauthtoken')">Mock</a>
    </div>

    <div class="input-field inline">
      <a class="waves-effect waves-light btn" v-on:click="set('http://localhost:9998/yourauthtoken')">Local</a>
    </div>

    <div class="input-field inline">
      <a class="waves-effect waves-light btn" v-on:click="set('http://admin.test.quoon.net/resources/ewogICJhZ2VudElkIiA6ICIzIiwKICAicGFzcyIgOiAidzM4a1dwIiwKICAibGFuIiA6ICJlbiIsCiAgImxvZ2luIiA6ICJERU1PIFhNTCBBR0VOVCIKfQ==')">QuoOn test</a>
    </div>

    <div class="input-field inline">
      <a class="waves-effect waves-light btn" v-on:click="set('http://comprahotelbeds.quoon.net/v2ukv2f2kvgy3tu5j8yxdzpt:dprMMrfFsz')">Traductor Hotelbeds</a>
    </div>

  </form>
  </div>

</template>

<script>

  export default {
        name: "Config",
    methods: {
      set: function(x) {
        console.log(x);
        globaldata.baseurl = x;
        this.$data.u = x;
      }
    },
      data: function() {
          return {
            u: globaldata.baseurl,
          }
      },
    mounted: function() {
      M.updateTextFields();
    },
    watch: {
      u: function (val) {
        console.log('baseurl ha cambiado a ' + val);
        localStorage.setItem("baseurl", val);
        globaldata.baseurl = val;
      },
    }
    }
</script>

<style scoped>

</style>
