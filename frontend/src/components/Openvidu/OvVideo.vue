<template>
  <video autoplay />
</template>

<script setup>
import { onMounted, ref } from 'vue'

const streamManager = ref()

onMounted(() => {
  streamManager.value.addVideoElement(ref(null))
})
</script>
