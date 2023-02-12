package com.geekster.UniversityEventManagement.repository;

import com.geekster.UniversityEventManagement.model.UEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<UEvent,Integer> {

}