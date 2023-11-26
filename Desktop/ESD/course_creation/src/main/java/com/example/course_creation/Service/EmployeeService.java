package com.example.course_creation.Service;

import com.example.course_creation.DAO.EmployeeDAO;
import com.example.course_creation.DAO.Implement.EmployeeDAOImp;
import com.example.course_creation.Entity.employee;

public class EmployeeService {
    EmployeeDAO employeeDAO = new EmployeeDAOImp();

    public boolean addEmployeeService(employee e){
        return employeeDAO.addEmployee(e);
    }

    public boolean verifyEmployeeService(employee e){
        return employeeDAO.verifyEmployee(e);
    }
}