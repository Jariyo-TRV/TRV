package com.ssafy.jariyo.domain.playroom.repository;

import com.ssafy.jariyo.domain.playroom.entity.Playroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayroomRepository extends JpaRepository<Playroom, Long> {
    Playroom findByStore_StoreId(Long storeId);

    List<Playroom> findAllByTitleContaining(String keyword);
}
