package com.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "H_loanApplicants")
public class LoanApplication {
	@Id
	private Integer lnap_id;
	private Integer lnap_cust_id;
	private Date lnap_apdate;
	private String lnap_lnty_id;
	private double lnap_amount;
	private double lnap_emi_range_from;
	private double lnap_emi_range_to;
	private double lnap_nom_requested;
	private Integer lnap_cibil_Score;
	private String lnap_status;
	private String lnap_conclusion_remarks;
	private Integer lnap_processed_user;
	private Date lnap_processed_Date;

	// Constructors

	public LoanApplication() {
		// Default constructor
	}

	public Integer getLnap_id() {
		return lnap_id;
	}

	public void setLnap_id(Integer lnap_id) {
		this.lnap_id = lnap_id;
	}

	public Integer getLnap_cust_id() {
		return lnap_cust_id;
	}

	public void setLnap_cust_id(Integer lnap_cust_id) {
		this.lnap_cust_id = lnap_cust_id;
	}

	public Date getLnap_apdate() {
		return lnap_apdate;
	}

	public void setLnap_apdate(Date lnap_apdate) {
		this.lnap_apdate = lnap_apdate;
	}

	public String getLnap_lnty_id() {
		return lnap_lnty_id;
	}

	public void setLnap_lnty_id(String lnap_lnty_id) {
		this.lnap_lnty_id = lnap_lnty_id;
	}

	public double getLnap_amount() {
		return lnap_amount;
	}

	public void setLnap_amount(double lnap_amount) {
		this.lnap_amount = lnap_amount;
	}

	public double getLnap_emi_range_from() {
		return lnap_emi_range_from;
	}

	public void setLnap_emi_range_from(double lnap_emi_range_from) {
		this.lnap_emi_range_from = lnap_emi_range_from;
	}

	public double getLnap_emi_range_to() {
		return lnap_emi_range_to;
	}

	public void setLnap_emi_range_to(double lnap_emi_range_to) {
		this.lnap_emi_range_to = lnap_emi_range_to;
	}

	public double getLnap_nom_requested() {
		return lnap_nom_requested;
	}

	public void setLnap_nom_requested(double lnap_nom_requested) {
		this.lnap_nom_requested = lnap_nom_requested;
	}

	public Integer getLnap_cibil_Score() {
		return lnap_cibil_Score;
	}

	public void setLnap_cibil_Score(Integer lnap_cibil_Score) {
		this.lnap_cibil_Score = lnap_cibil_Score;
	}

	public String getLnap_status() {
		return lnap_status;
	}

	public void setLnap_status(String lnap_status) {
		this.lnap_status = lnap_status;
	}

	public String getLnap_conclusion_remarks() {
		return lnap_conclusion_remarks;
	}

	public void setLnap_conclusion_remarks(String lnap_conclusion_remarks) {
		this.lnap_conclusion_remarks = lnap_conclusion_remarks;
	}

	public Integer getLnap_processed_user() {
		return lnap_processed_user;
	}

	public void setLnap_processed_user(Integer lnap_processed_user) {
		this.lnap_processed_user = lnap_processed_user;
	}

	public Date getLnap_processed_Date() {
		return lnap_processed_Date;
	}

	public void setLnap_processed_Date(Date lnap_processed_Date) {
		this.lnap_processed_Date = lnap_processed_Date;
	}
}