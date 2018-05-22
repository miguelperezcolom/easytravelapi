<template>
<div class="container center"><h1>Welcome XXXX!</h1>
  <i class="material-icons green large circle">done</i>
<h4>Ready to start</h4>
</div>
</template>

<script>
    export default {
        name: "Ok",
      data: function() {
          return {
            bookingId: null,
          };
    }, mounted() {
        this.$data.bookingId = this.$route.query.bookingId;
      }
    }
</script>

<style scoped>

</style>
