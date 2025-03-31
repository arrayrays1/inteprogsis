package com.mydbcu.sis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mydbcu.sis.course;

public interface CourseRepository extends JpaRepository<course, Long> {
}

