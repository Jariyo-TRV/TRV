<template>
  <LogoutHome v-if="isLogin" />
  <LoginHome v-else />
</template>

<script setup>
import LogoutHome from '@/components/Home/LogoutHome.vue';
import LoginHome from '@/components/Home/LoginHome.vue'

const isLogin = false

</script>

<style scoped>

</style>
