package com.ssafy.jariyo.domain.store.repository;

import com.ssafy.jariyo.domain.store.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    Store findByStoreId(Long storeId);
}
