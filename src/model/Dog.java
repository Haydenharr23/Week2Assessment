package model;

import java.time.LocalDate;

/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Sep 6, 2022
 */
public class Dog {

	private String name;
	private int age;
	private LocalDate vaccineDate;
	
	public Dog(String n, int a, LocalDate vd) {
		this.name=n;
		this.age=a;
		this.vaccineDate=vd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLastVaccination() {
		return vaccineDate;
	}
	
	public void setVaccineDate(LocalDate vaccineDate) {
		this.vaccineDate = vaccineDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
