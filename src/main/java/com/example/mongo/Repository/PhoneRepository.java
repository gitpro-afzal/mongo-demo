package com.example.mongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongo.Entity.Phone;


@Repository
public interface PhoneRepository extends MongoRepository<Phone, Long>{

}
