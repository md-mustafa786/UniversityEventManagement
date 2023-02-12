package com.geekster.UniversityEventManagement.repository;

import com.geekster.UniversityEventManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}

