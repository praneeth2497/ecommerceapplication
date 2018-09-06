package com.praneeth.web1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
@Entity
@Table(name="register")
public class Register
{
/*    @Id
    private int userId;*/
	@Id
	
    private String userName;
    @Column
    private String dob;
    @Column
    private String address;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String mobileNumber;
    @Column
    private String role;
    @Column
    private boolean enabled;
    public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    /*public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }*/
   
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
    

}