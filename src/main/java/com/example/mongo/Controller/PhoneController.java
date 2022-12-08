package com.example.mongo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.Entity.Phone;
import com.example.mongo.Service.PhoneService;



@RestController
public class PhoneController {
	
	
	@Autowired
	private PhoneService serv;
	
	
	@GetMapping("/allPhones")
	public List<Phone> getAllPhones() {
		return serv.retrieveAllPhones();
	}
	
	@GetMapping("/phone/{id}")
	public Phone getOnePhone(@PathVariable("id") Long id) {
		return serv.retrieveOnePhone(id);
	}
	
	@PostMapping("/addPhone")
	public Phone addPhone(@RequestBody Phone phone) {
		return serv.insertPhone(phone);
	}
	
	@DeleteMapping("/deletePhone/{id}")
	public String deletePhone(@PathVariable("id") Long id) {
		return serv.dropPhone(id);
	}
	

}
