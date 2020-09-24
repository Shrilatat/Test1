package com.hsbc.practical;

import java.util.Scanner;

public class TestOps {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		FoodDao food = new FoodDao();
		ApparelDao apparel = new ApparelDao();
		ElectronicsDao electronics = new ElectronicsDao();
		
		boolean bool = true;
		int choice = 0;
		do {
		System.out.println("-----MENU-----"
				+ "\n1. Input Food Details"
				+ "\n2. Input Apparel Details"
				+ "\n3. Input Electronics Details"
				+ "\n4. Generate Report"
				+ "\n5. Exit"
				+ "\nEnter Choice: ");
		choice = in.nextInt();
		switch(choice) {
		case 1:
			try {
				food.addFood();
			} catch (ItemAlreadyExistException e2) {
				e2.getMessage();
			}
			break;
			
		case 2:
			try {
				apparel.addApparel();
			} catch (ItemAlreadyExistException e1) {
				e1.getMessage();
			}
			break;
			
		case 3:
			try {
				electronics.addElectronics();
			} catch (ItemAlreadyExistException e) {
				e.getMessage();
			}
			break;
			
		case 4:
			food.display();
			apparel.display();
			electronics.display();
			break;
			
		case 5:
			bool = false;
			System.exit(0);
			break;
			
		default:
			System.out.println("Wrong Choice !!");
			
		}
		}while(bool);
	}
}
