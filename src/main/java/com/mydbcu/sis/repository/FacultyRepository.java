package com.mydbcu.sis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mydbcu.sis.faculty;

public interface FacultyRepository extends JpaRepository<faculty, Long> {
}
