package com.project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private long anum;
	private String address;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public long getAnum() {
		return anum;
	}
	public void setAnum(long anum) {
		this.anum = anum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
