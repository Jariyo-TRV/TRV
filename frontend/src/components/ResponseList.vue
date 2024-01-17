<template>
  <div>
    <ResponseListItem
    v-for="res in store.responses"
    :res="res"
    style="border: 1px solid; margin: 5px; padding: 8px 24px; width: 300px; text-align: center; display: flex;"
    />
  </div>
</template>

<script setup>
import { useCounterStore } from '@/stores/counter';
import ResponseListItem from './ResponseListItem.vue';

const store = useCounterStore()

</script>

<style scoped>

</style>