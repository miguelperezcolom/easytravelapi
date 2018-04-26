<template>
<div>

  <formulario></formulario>

</div>
</template>

<script>

  import Formulario from "./Formulario.vue"

    export default {
        name: "Hotel"
      , data: function () {
        return {
          count: 0
        }
      },
      components: {
          Formulario
      }
    }
</script>

<style scoped>

</style>
