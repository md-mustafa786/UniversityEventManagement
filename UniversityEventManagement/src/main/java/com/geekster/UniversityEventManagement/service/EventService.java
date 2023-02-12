package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.UEvent;
import com.geekster.UniversityEventManagement.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;
    public List<UEvent> getAllevent() {
        return eventRepository.findAll();
    }

    public void saveevent(UEvent event) {
        eventRepository.save(event);
    }

    public UEvent getBYid(int id) {
        return eventRepository.findById(id).get();
    }

    public void updateE(int id,UEvent newevent) {
        UEvent event =eventRepository.findById(id).get();
        event.setEventId(newevent.getEventId());
        event.setEName(newevent.getEName());
        event.setELocat(newevent.getELocat());
        event.setEDate(newevent.getEDate());
        event.setSTime(newevent.getSTime());
        event.setEndTime(newevent.getEndTime());
        event.setImgurl(newevent.getImgurl());
        eventRepository.save(event);
    }

    public void deleteevent(int id) {
        eventRepository.deleteById(id);
    }
}