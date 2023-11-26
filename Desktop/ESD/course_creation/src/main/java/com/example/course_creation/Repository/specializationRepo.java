package com.example.course_creation.Repository;

import com.example.course_creation.Entity.specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface specializationRepo extends JpaRepository<specialization, Integer>
{

}
