package com.mydbcu.sis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;  // Make sure this is imported

import com.mydbcu.sis.student;

@Repository  // Add this annotation
public interface StudentRepository extends JpaRepository<student, Long> {
}