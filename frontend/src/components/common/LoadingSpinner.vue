<template>
    <v-progress-circular v-if="loading" indeterminate color="amber"></v-progress-circular>
</template>

<script setup>
import { ref, watch } from 'vue';

const loading = ref(false);

// App.vue로부터 받은 loading 값을 감시하여 업데이트
watch(
    () => $props.loading,
    (newValue) => {
        loading.value = newValue;
    }
);
</script>

<style scoped>
/* 로딩 스피너의 스타일 */
</style>
