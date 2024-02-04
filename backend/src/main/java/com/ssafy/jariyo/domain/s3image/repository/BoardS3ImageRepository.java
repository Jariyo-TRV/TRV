package com.ssafy.jariyo.domain.s3image.repository;

import com.ssafy.jariyo.domain.s3image.entity.BoardS3Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardS3ImageRepository extends JpaRepository<BoardS3Image, Long> {

}