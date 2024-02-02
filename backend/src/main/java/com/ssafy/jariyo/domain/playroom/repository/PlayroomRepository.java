package com.ssafy.jariyo.domain.playroom.repository;

import com.ssafy.jariyo.domain.playroom.entity.Playroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayroomRepository extends JpaRepository<Playroom, Long> {
    Playroom findByStore_StoreId(Long storeId);
}
