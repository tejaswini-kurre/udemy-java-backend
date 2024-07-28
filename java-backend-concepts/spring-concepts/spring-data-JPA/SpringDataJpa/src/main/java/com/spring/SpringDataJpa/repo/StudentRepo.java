package com.spring.SpringDataJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.SpringDataJpa.model.student;

@Repository
public interface StudentRepo extends JpaRepository<student, Integer> {
}
