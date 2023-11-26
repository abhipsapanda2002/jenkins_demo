package com.example.course_creation.DAO;

import com.example.course_creation.Entity.employee;

public interface EmployeeDAO {
     boolean addEmployee(employee emp);

     boolean verifyEmployee(employee emp);
}
