package com.example.mongo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongo.Entity.Phone;
import com.example.mongo.Exception.PhoneNotFoundException;
import com.example.mongo.Repository.PhoneRepository;

@Service
public class PhoneService {

	
	@Autowired
	private PhoneRepository repo;
	
	
	public List<Phone> retrieveAllPhones() {
		return repo.findAll();
	}
	
	public Phone insertPhone(Phone phone) {
		return repo.save(phone);
	}
	
	public Phone retrieveOnePhone(Long id) {
		Optional<Phone> phone = repo.findById(id);
		if(phone == null) throw new PhoneNotFoundException("Phone id does not exist");
		else return phone.get();
	}
	 
	public String dropPhone(Long id) {
		repo.deleteById(id);
		return "Phone with id " + id + " is deleted";
	}
	
	
}
