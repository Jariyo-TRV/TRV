import { ref, computed } from 'vue';
import { defineStore } from 'pinia';
import axios from 'axios';
import router from '@/router';

export const useCounterStore = defineStore(
    'counter',
    () => {
        const API_URL = import.meta.env.VITE_API_URL;

        return {
            API_URL,
        };
    },
    { persist: true }
);
