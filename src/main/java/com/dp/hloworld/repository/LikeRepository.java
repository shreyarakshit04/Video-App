package com.dp.hloworld.repository;

import com.dp.hloworld.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Likes,Long> {

    @Query(value = "SELECT l.videoId FROM Likes l WHERE l.userId = :id")
    List<Long> findByUserId(@Param("id")long id);
}
