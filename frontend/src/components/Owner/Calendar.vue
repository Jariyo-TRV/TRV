<template>
    <v-container>
        <v-row justify="center">
            <v-date-picker v-model="selectedDate" width="350"></v-date-picker>
        </v-row>
    </v-container>
</template>

<script setup>
import { ref } from 'vue';

const selectedDate = ref(new Date());
</script>

<style scoped></style>
