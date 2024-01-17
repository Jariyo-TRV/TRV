<template>
  <div>
    <p>{{ res.name}}</p>
    <p>{{ res.stuNum }}</p>
    <p>{{ res.email }}</p>
  </div>
</template>

<script setup>
defineProps({
  res: Object
})
</script>

<style scoped>

</style>