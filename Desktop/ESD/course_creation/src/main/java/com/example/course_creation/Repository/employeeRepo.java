package com.example.course_creation.Repository;

import com.example.course_creation.Entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepo extends JpaRepository<employee,Integer> {

}
