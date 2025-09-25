package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>{

}
