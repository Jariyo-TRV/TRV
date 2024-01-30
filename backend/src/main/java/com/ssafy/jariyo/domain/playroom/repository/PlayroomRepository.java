package com.ssafy.jariyo.domain.playroom.repository;

import com.ssafy.jariyo.domain.playroom.dto.PlayroomResponseGetDto;
import com.ssafy.jariyo.domain.playroom.entity.Playroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayroomRepository extends JpaRepository<Playroom, Long> {

}
