package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")//it means prototype will create now that means every time u calling getbeans it will create the object
public class Alien {
	public Alien() {
		System.out.println("Object Created ");
	}
	private int aid;
	private String aname;
	private String acourse;
	@Autowired
	@Qualifier("l1")
	private Laptop laptop;

	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}

	
	public void show() {
		System.out.println("Hello world");
		laptop.compile();
	}
}
