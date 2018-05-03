<template>
<div class="container center"><h1>Thank you!</h1>
  <i class="material-icons green large circle">done</i>
<h4>Your booking has been confirmed with ID: {{bookingId}}</h4>
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
