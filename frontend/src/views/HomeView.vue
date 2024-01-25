<template>
    <LogoutHome v-if="!accessToken" />
    <LoginHome v-else />
</template>

<script setup>
import LogoutHome from '@/components/Home/LogoutHome.vue';
import LoginHome from '@/components/Home/LoginHome.vue';


const accessToken = localStorage.getItem('accessToken');
const isLogin = false;
</script>

<style scoped></style>
