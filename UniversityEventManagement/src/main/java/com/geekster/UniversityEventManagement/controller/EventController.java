package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.UEvent;
import com.geekster.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/uem/event")
public class EventController {
    @Autowired
    EventService eventService;
    @GetMapping("get-all-event-info")
    public List<UEvent> getAll(){
        return eventService.getAllevent();
    }
    @GetMapping("/getevent-by-id/{id}")
    public UEvent getbyId(@PathVariable int id){
        return eventService.getBYid(id);
    }
    @PostMapping("/save-event")
    public void saveEvent(@RequestBody UEvent event){
        eventService.saveevent(event);
    }
    @PutMapping("/update-event/id/{id}")
    public void update(@PathVariable int id,@RequestBody UEvent event){
        eventService.updateE(id,event);
    }
    @DeleteMapping("/delete/id/{id}")
    public void deleteE(@PathVariable int id ){
        eventService.deleteevent(id);
    }


}
