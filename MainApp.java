package com.MainApp;

import java.util.Scanner;

import com.ExpenceTracker.ExpenceTracker;

public class MainApp {

	public static void main(String[] args) {
		ExpenceTracker expenceTracker=new ExpenceTracker();
		try (Scanner scanner = new Scanner(System.in)) {
			int ch;
			
			do {
				System.out.println("=== Expense Tracker ===");
			    System.out.println("1. Add Expense");
			    System.out.println("2. View All Expenses");
			    System.out.println("3. View Total Expenses");
			    System.out.println("4. Delete Expense");
			    System.out.println("5. Exit");
			    System.out.print("Enter your choice: ");
				ch=scanner.nextInt();
			switch(ch) {
				case 1:
					expenceTracker.addExpence();
					break;
				case 2:
					expenceTracker.viewExpence();
					break;
				case 3:
					expenceTracker.viewAllExpence();
					break;
				case 4:
					expenceTracker.deleteExpence();
					break;
				case 5:
					return;
				default:
					System.out.println("Invalid Choice! Please Valid Choice..");
			}
			
           }while(ch!=3);
		}

	}

}
