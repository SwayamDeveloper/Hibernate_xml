package com.tele.hibernatefinal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coding")
public class Staff_list {

private int id;
private String name;
@Id	
private String city;
private int phone;
private String country;

@Override
public String toString() {
	return "Staff_list [name=" + name + ", id=" + id + ", city=" + city + ", phone=" + phone + ", country=" + country + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getcity() {
	return city;
}
public void setcity(String city) {
	this.city = city;
}
public int getphone() {
	return phone;
}
public void setphone(int phone) {
	this.phone = phone;
}

public  String getcountry() {
	return country;
}
public void setcountry(String country) {
	this.country = country;
}
}
