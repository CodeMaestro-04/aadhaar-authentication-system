package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Person;
import com.project.repository.PersonRepo;



@RestController
public class PersonController {

	@Autowired
	PersonRepo prepo;
	
	@PostMapping("/savePerson")
	public String savePerson(@RequestBody Person person) {
		prepo.save(person);
		return "Person saved successfully";
	}
	

    // UPDATE
    @PutMapping("/updatePerson")
    public String updatePerson(@RequestBody Person person) {
        prepo.save(person);
        return "Person updated successfully";
    }

    // DELETE
    @DeleteMapping("/deletePerson/{pid}")
    public String deletePerson(@PathVariable int pid) {
        prepo.deleteById(pid);
        return "Person deleted successfully";
    }

    // GET one
    @GetMapping("/findPerson/{pid}")
    public Person findPersonById(@PathVariable int pid) {
        return prepo.findById(pid).orElse(null);
    }

    // GET all
    @GetMapping("/fetchAllPersons")
    public List<Person> getAllPersons() {
        return prepo.findAll();
    }
}
