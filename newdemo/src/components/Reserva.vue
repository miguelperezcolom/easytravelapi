<template>

  <div>

    <nav>

      <div class="nav-wrapper">

      <a class="brand-logo" style="margin-left: 10px;">Atenea2</a>

        <a data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>

        <ul id="nav-mobile" class="right hide-on-med-and-down">
        <router-link :to="{name: 'hotel_formulario'}" tag="li" active-class="active"><a>Hotel</a></router-link>
        <router-link :to="{name: 'traslado_formulario'}" tag="li" active-class="active"><a>Traslado</a></router-link>
        <router-link :to="{name: 'excursion_formulario'}" tag="li" active-class="active"><a>Excursion</a></router-link>
          <router-link :to="{name: 'login'}" tag="li" active-class="active"><a>Agent sign in</a></router-link>
        <router-link :to="{name: 'config'}" tag="li" active-class="active"><a>{{ baseurl }}</a></router-link>
      </ul>
    </div>
    </nav>

    <ul class="sidenav" id="mobile-demo">
      <li><a v-on:click="ir('hotel_formulario')">Hotel</a></li>
      <li><a v-on:click="ir('traslado_formulario')">Traslado</a></li>
      <li><a v-on:click="ir('excursion_formulario')">Excursion</a></li>
      <li><a v-on:click="ir('login')">Agent sign in</a></li>
      <li><a v-on:click="ir('config')">{{ baseurl }}</a></li>
    </ul>

    <router-view/>

  </div>

</template>

<script>

  console.log(globaldata);

  var sidenav;

    export default {
        name: "Reserva",
      data: function() {
          return globaldata;
      },
      methods: {
          ir: function(n) {
            sidenav.close();
            this.$router.push({name: n,});
          }
      },
      mounted: function() {
        sidenav = M.Sidenav.init(document.querySelector('.sidenav'), {});
      }
    }
</script>

<style scoped>

</style>
