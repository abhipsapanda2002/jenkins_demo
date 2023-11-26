package com.example.course_creation.Controllers;

import com.example.course_creation.Entity.employee;
import com.example.course_creation.Repository.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/api/v1")
public class employeeController {

    @Autowired
    private employeeRepo employeeRepo;

    @GetMapping("/employees")
    public List<employee> getAllEmp(){
        return employeeRepo.findAll();
    }

    //create employee REST API
    @PostMapping("/employees")
    public employee createEmployee (@RequestBody employee e)
    {
        return employeeRepo.save(e);
    }

}
