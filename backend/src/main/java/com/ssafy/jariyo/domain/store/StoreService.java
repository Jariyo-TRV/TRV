package com.ssafy.jariyo.domain.store;

import com.ssafy.jariyo.domain.store.dto.StoreResponseDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;

    public List<StoreResponseDto> getStores() {
        return storeRepository.findStores();
    }

}