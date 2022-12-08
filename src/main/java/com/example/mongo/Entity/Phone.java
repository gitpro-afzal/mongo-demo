package com.example.mongo.Entity;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Phones")
public class Phone {
	
	private Long id;
	private String company;
	private String model;
	private Integer year;
	private Double price;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	} 
	
	
	

}
