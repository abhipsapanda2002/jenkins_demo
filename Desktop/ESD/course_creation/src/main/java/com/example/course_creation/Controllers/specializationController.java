package com.example.course_creation.Controllers;

import com.example.course_creation.Entity.specialization;
import com.example.course_creation.Repository.specializationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/api/v1")
public class specializationController {

    @Autowired
    private specializationRepo specializationRepo;

    @GetMapping("/special")
    public List<specialization> getAllSpl(){
        return specializationRepo.findAll();
    }

    //create employee REST API
    @PostMapping("/special")
    public specialization createSpl (@RequestBody specialization sp)
    {
        return specializationRepo.save(sp);
    }
}
