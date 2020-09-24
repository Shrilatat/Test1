package com.hsbc.service;

/**
 * @author bk
 * Purpose: Driver for our application....
 */

import java.util.Scanner;

import com.hsbc.dao.ProductDaoImpl;

public class TestProductDao {
	public static void main(String[] args) {
		ProductDaoImpl dao = new ProductDaoImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("==============================");
			System.out.println("Enter number 1,2,3 for which you will like to see report:");
			System.out.println("Food items");
			System.out.println("Apparels");
			System.out.println("Electronics\n");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				dao.displayReport("Food items");
				break;
			case 2:
				dao.displayReport("Apparels");
				break;
			case 3:
				dao.displayReport("Electronics");
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("wrong choice.Try again");
			}
		} while (choice != 4);
		// dao.displayReport("Food items");
	}
}
