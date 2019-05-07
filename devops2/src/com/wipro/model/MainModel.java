package com.wipro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class MainModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "user")
	@SequenceGenerator(name = "user", sequenceName = "user_id_seq")
	private int id;
	@Column(columnDefinition = "VARCHAR(25)")
	private String name;
	@Column(columnDefinition = "VARCHAR(25)")
	private String pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
