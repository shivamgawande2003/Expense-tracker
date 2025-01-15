package com.Expence;

import java.time.LocalDate;

public class Expence {
	int Expence_id;
	LocalDate date;
	String category;
	String discription;
	double amount;
	
	public Expence() {
		// TODO Auto-generated constructor stub
	}

	public Expence(int expence_id, LocalDate date, String category, String discription, double amount) {
		Expence_id = expence_id;
		this.date = date;
		this.category = category;
		this.discription = discription;
		this.amount = amount;
	}

	public int getExpence_id() {
		return Expence_id;
	}

	public void setExpence_id(int expence_id) {
		Expence_id = expence_id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
