<template>
  <div><h1>Error</h1>
    <h2>{{error}}</h2>
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
