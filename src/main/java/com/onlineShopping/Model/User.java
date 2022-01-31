package com.onlineShopping.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="user_profile")
public class User 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	
    @Column(name="username")
	private String username;
	private long phonenumber;
	private String password;
	
	@Column(name="confirmpassword")
	private String confirmpassword;
	
	public User()
	{
		super();
	}
	public User(int id, String name, String address, String username, long phonenumber, String password,
			String confirmpassword) 
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.username=username;
		this.phonenumber=phonenumber;
		this.password=password;
		this.confirmpassword=confirmpassword;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", username=" + username
				+ ", phonenumber=" + phonenumber + ", password=" + password + ", confirmpassword=" + confirmpassword
				+ "]";
	}
	
	
}
