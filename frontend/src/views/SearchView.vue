<template>
    <div>list 목록입니다.</div>
    <div v-for="item in dataGet" :key="item.storeName">
        <p>{{ item.storeName }}</p>
    </div>
</template>

<script setup>
import SearchList from '@/components/SearchList.vue';
import { useCounterStore } from '@/stores/counter';

const store = useCounterStore();
const dataGet = store.dataGet;
console.log(dataGet);
</script>

<style scoped></style>
