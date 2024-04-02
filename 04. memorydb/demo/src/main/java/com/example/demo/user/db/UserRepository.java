package com.example.demo.user.db;

import com.example.demo.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // select * from user where score >= [??]
    public List<UserEntity> findAllByScoreGreaterThanEqual(int score);

    // select * from user where score >= ?? and score <= ??
    List<UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min, int max);

}
