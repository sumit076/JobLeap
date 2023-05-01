package com.c2tc.college.repositry;

import com.c2tc.college.model.College;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CollegeRepositry extends JpaRepository<College, Long> {
}


