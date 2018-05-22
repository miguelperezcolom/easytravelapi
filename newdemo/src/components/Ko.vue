<template>
  <div class="container center"><h1>We are sorry. It did not work</h1>
    <i class="material-icons red large circle">error</i>
    <h4>{{ error }}</h4>
  </div>
</template>

<script>
    export default {
        name: "Ko",
      data: function() {
        return {
          error:null
        }
      }, mounted() {
          this.$data.error = this.$route.query.error;
      }
    }
</script>

<style scoped>

</style>
