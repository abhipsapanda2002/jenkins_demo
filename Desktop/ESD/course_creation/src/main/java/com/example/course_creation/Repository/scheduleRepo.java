package com.example.course_creation.Repository;

import com.example.course_creation.Entity.schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface scheduleRepo extends JpaRepository<schedule, Integer> {
}
