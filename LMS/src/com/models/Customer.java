package com.models;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Table;

@Embeddable
@Table(name = "H_customeres")
public class Customer {
	@Id
	private int cust_id;
	private String cust_firstname;
	private String cust_lastname;
	private Date cust_dob;
	private String cust_panno;
	private String cust_mobile;
	private String cust_address;
	private String cust_gname;
	private Date cust_luudate;
	private int cust_luser;

	// Constructors

	public Customer() {
		// Default constructor
	}

	public Customer(int cust_id, String cust_firstname, String cust_lastname, Date cust_dob, String cust_panno,
			String cust_mobile, String cust_address, String cust_gname, Date cust_luudate, int cust_luser) {
		this.cust_id = cust_id;
		this.cust_firstname = cust_firstname;
		this.cust_lastname = cust_lastname;
		this.cust_dob = cust_dob;
		this.cust_panno = cust_panno;
		this.cust_mobile = cust_mobile;
		this.cust_address = cust_address;
		this.cust_gname = cust_gname;
		this.cust_luudate = cust_luudate;
		this.cust_luser = cust_luser;
	}

	// Getter and Setter methods

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_firstname() {
		return cust_firstname;
	}

	public void setCust_firstname(String cust_firstname) {
		this.cust_firstname = cust_firstname;
	}

	public String getCust_lastname() {
		return cust_lastname;
	}

	public void setCust_lastname(String cust_lastname) {
		this.cust_lastname = cust_lastname;
	}

	public Date getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(Date cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_panno() {
		return cust_panno;
	}

	public void setCust_panno(String cust_panno) {
		this.cust_panno = cust_panno;
	}

	public String getCust_mobile() {
		return cust_mobile;
	}

	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_gname() {
		return cust_gname;
	}

	public void setCust_gname(String cust_gname) {
		this.cust_gname = cust_gname;
	}

	public Date getCust_luudate() {
		return cust_luudate;
	}

	public void setCust_luudate(Date cust_luudate) {
		this.cust_luudate = cust_luudate;
	}

	public int getUserTypes() {
		return cust_luser;
	}

	public void setUserTypes(int cust_luser) {
		this.cust_luser = cust_luser;
	}
}
