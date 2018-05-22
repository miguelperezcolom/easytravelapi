<template>
<div class="container center"><h1>Agent access</h1>

  <div class="row">
    <form class="col offset-m4 m4 s12">
      <div class="row">
        <div class="input-field col s12">
          <input id="login" type="text" class="validate">
          <label for="login">User</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="password" type="password" class="validate">
          <label for="password">Password</label>
        </div>
      </div>
      <div class="row">
        <div class="col s12">
          <a class="waves-effect waves-light btn" v-on:click="signin">Sign in</a>
        </div>
      </div>
    </form>
  </div>


</div>
</template>

<script>
    export default {
        name: "Login",
      data: function() {
          return {
            user: null,
            password: null,
          };
    }, mounted() {

      }
      , methods: {
          signin: function() {
            console.log('signin');
            this.$router.push({ name: 'welcome', query: {msg: 'Hola' } });
          }
      }
    }
</script>

<style scoped>

</style>
