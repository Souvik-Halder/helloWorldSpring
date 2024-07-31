package com.example.demo;

import org.springframework.stereotype.Component;

@Component("l1")
public class Laptop {
	private int lapid;
	private String lapname;
	public int getLapid() {
		return lapid;
	}
	public void setLapid(int lapid) {
		this.lapid = lapid;
	}
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", lapname=" + lapname + "]";
	}
	public void compile() {
		System.out.println("Compiling");
	}
	
}
