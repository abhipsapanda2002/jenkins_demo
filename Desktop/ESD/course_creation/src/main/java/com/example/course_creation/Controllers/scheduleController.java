package com.example.course_creation.Controllers;

import com.example.course_creation.Entity.employee;
import com.example.course_creation.Entity.schedule;
import com.example.course_creation.Repository.scheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/v1")
public class scheduleController {

    @Autowired
    private scheduleRepo scheduleRepo;

    @GetMapping("/schedules")
    public List<schedule> getAllSch(){
        return scheduleRepo.findAll();
    }

    //create employee REST API
    @PostMapping("/schedules")
    public schedule createSchedule (@RequestBody schedule s)
    {
        return scheduleRepo.save(s);
    }
}
