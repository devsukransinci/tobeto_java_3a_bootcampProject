package com.tobeto.bootcampProject.dataAcsess.abstracts;


import com.tobeto.bootcampProject.entities.concretes.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
}