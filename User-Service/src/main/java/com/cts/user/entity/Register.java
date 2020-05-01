package com.cts.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uId")
	private int userId;
    @Column(name="uName")
	private String userName;
    @Column(name="pwd")
	private String password;
    @Column(name="mNum")
	private long mobileNumber;
    
	public Register() {
		super();
	}

	public Register(int userId, String userName, String password, int mobileNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
