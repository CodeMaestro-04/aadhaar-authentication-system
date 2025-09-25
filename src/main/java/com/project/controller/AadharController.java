package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Aadhar;
import com.project.repository.AadharRepo;


@RestController
public class AadharController {
	
	@Autowired
	AadharRepo arepo;
	
	@PostMapping("/saveAadhar")
	public String saveAadhar(@RequestBody Aadhar aadhar) {
		arepo.save(aadhar);
		return "Saved";
	}
	

	@PutMapping("/update")
	public String updateAadhar(@RequestBody Aadhar aadhar) {
		arepo.save(aadhar);
		return "Updated successfully";
	}
	
	@DeleteMapping("/delete/{aid}")
	public String deleteAadhar(@PathVariable int aid) {
		arepo.deleteById(aid);
		return "Deleted successfully";
	}

	@GetMapping("find/{aid}")
	public Aadhar findSingleAadharById(@PathVariable int aid) {
		
		Optional<Aadhar> opt = arepo.findById(aid);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			return null;
		}
	}
	
	
	@GetMapping("/fetchAll")
	public List<Aadhar> getAll(){
		return arepo.findAll();
	}
	
	
	//Authentication
	@PostMapping("/authenticate")
    public String authenticate(@RequestBody Aadhar input) {
        Aadhar dbAadhar = arepo.findByAnum(input.getAnum());

        if (dbAadhar != null && dbAadhar.getAddress().equals(input.getAddress())) {
            return "Authentication Successful ✅";
        } else {
            return "Authentication Failed ❌";
        }
    }
}
