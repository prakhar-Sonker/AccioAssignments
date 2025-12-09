package com.example.accioshop.repository;


import com.example.accioshop.model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {

    Optional<Reviews> findById(int id);
}
