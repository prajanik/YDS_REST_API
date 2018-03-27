package com.yds.api.web.param;

import java.io.Serializable;

/**
 * @author nikhil
 * @date Mar 26, 2018
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 1868934055740383046L;

	private String firstName;
	private String lastName;
	private String email;
	private int ph_no;
	private String address;
	private String mandal;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the ph_no
	 */
	public int getPh_no() {
		return ph_no;
	}
	/**
	 * @param ph_no the ph_no to set
	 */
	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the mandal
	 */
	public String getMandal() {
		return mandal;
	}
	/**
	 * @param mandal the mandal to set
	 */
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", ph_no=" + ph_no
				+ ", address=" + address + ", mandal=" + mandal + "]";
	}
	
}
