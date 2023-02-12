package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.service.STservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/uem")
public class STcontroller {
    @Autowired
    private STservice ueMservice;
    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student){
        ueMservice.addSt(student);
    }
    @GetMapping("/get-all")
    public List<Student> getAllst(){
        return ueMservice.getall();
    }
    @GetMapping("/get-by/id/{id}")
    public Student getbyId(@PathVariable int id){
        return ueMservice.getbyid(id);
    }
    @PutMapping("/update-st/")
    public void upadteSt(@RequestParam int id,@RequestBody Student student){
        ueMservice.update(id,student);
    }
    @DeleteMapping("/delete-st-by-id/{id}")
    public void deletebyId(@PathVariable int id){
        ueMservice.delete(id);
    }


}