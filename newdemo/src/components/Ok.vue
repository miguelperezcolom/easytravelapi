<template>
<div><h1>Ok</h1>
<h2>Booking ID: {{bookingId}}</h2>
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
