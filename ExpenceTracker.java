package com.ExpenceTracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.Expence.Expence;

public class ExpenceTracker {
	Scanner scanner=new Scanner(System.in);
	ArrayList<Expence> expences;
	int nextId;
	
	public ExpenceTracker() {
		this.expences = new ArrayList<Expence>();
		this.nextId = 0;
	}

	
	public ExpenceTracker(int nextId) {
		super();
		this.nextId = nextId;
	}


	public ArrayList<Expence> getExpences() {
		return expences;
	}

	public void setExpences(ArrayList<Expence> expences) {
		this.expences = expences;
	}

	public int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}
    
	
	public void addExpence() {
		System.out.println("Enter the Expence Category :");
		String category=scanner.nextLine();
		System.out.println("Enter the sort Discription :");
		String discription=scanner.nextLine();
		System.out.println("Enter the Expence Amount :");
		double amount=scanner.nextDouble();
		LocalDate date=LocalDate.now();
		
		Expence expense=new Expence(nextId++,date,category,discription,amount);
		expences.add(expense);
		
		System.out.println("Expences Add Succussfully....");
	}
	
	public void viewExpence() {
		System.out.printf("%-5s %-12s %-15s %-50s %-10s%n", "ID", "Date", "Category", "Description", "Amount");
		for(Expence expence:expences) {
			System.out.printf("%-5d %-12s %-15s %-50s %-10.2f%n",expence.getExpence_id(),expence.getDate(),expence.getCategory(),expence.getDiscription(),expence.getAmount());
		}
	}
	
	public void viewAllExpence() {
		double totalExpence=0;
		for(Expence expence:expences) {
			totalExpence+=expence.getAmount();
		}
		System.out.println("Total Expence :"+totalExpence);
	}
	
	public void deleteExpence() {
		System.out.println("Enter the Expence Id:");
		int id=scanner.nextInt();
		for(Expence expence:expences) {
			if(expence.getExpence_id()==id) {
				expences.remove(expence);
			}
			 System.out.println("Expense deleted successfully!");	
		}		
	}
}
