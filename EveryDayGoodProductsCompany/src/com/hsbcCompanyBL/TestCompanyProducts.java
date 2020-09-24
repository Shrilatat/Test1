package com.hsbcCompanyBL;

import java.util.Scanner;

import com.hsbc.companyDao.Apparel;
import com.hsbc.companyDao.Electronics;
import com.hsbc.companyDao.FoodItems;
import com.hsbc.companyDao.MATERIAL;
import com.hsbc.companyDao.NoSuchCategoryAvailable;
import com.hsbc.companyDao.ProductManipulation;
import com.hsbc.companyDao.SIZE;

public class TestCompanyProducts {

	public void display(int type) throws NoSuchCategoryAvailable{
		if (type == 1)
			pm.displayFoodItems();
		else if (type == 2)
			pm.displayElectronicItems();
		else if (type == 3)
			pm.displayApparelItems();
		else
			throw new NoSuchCategoryAvailable();
	}

	static ProductManipulation pm = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pm = new ProductManipulation();

		pm.addFoodItems(new FoodItems(100, "Milk", 30, 40, "22/09/2020", "28/09/2020", true)); // adds
																								// food
																								// items
																								// to
																								// the
																								// set
		pm.addFoodItems(new FoodItems(101, "Milk", 30, 50, "22/09/2020", "28/09/2020", true));
		pm.addFoodItems(new FoodItems(102, "Milk", 30, 18, "22/09/2020", "28/09/2020", true));
		pm.addFoodItems(new FoodItems(103, "Milk", 30, 68, "22/09/2020", "28/09/2020", true));
		pm.addFoodItems(new FoodItems(104, "Milk", 30, 10, "22/09/2020", "28/09/2020", true));

		pm.displayFoodItems();

		System.out.println("----------------------------------");

		pm.addApparelItems(new Apparel(100, "T-Shirt", 100, 20, SIZE.S, MATERIAL.COTTON));
		pm.addApparelItems(new Apparel(100, "T-Shirt", 100, 100, SIZE.S, MATERIAL.WOOLEN));
		pm.addApparelItems(new Apparel(100, "T-Shirt", 100, 50, SIZE.S, MATERIAL.WOOLEN));

		pm.displayApparelItems();
		// As enum is defined material and size will not accept other values to
		// prevent misuse of data.

		/*
		 * pm.addApparelItems(new Apparel(100, "T-Shirt", 100, 20, SIZE.S,
		 * MATERIAL.nylon));
		 */

		pm.addElectronicItems(new Electronics(001, "TV", 200000, 9, 48));
		pm.addElectronicItems(new Electronics(002, "Phone", 200000, 10, 48));
		pm.addElectronicItems(new Electronics(003, "Speaker", 200000, 0, 48));
		pm.addElectronicItems(new Electronics(004, "Mouse", 200000, 22, 48));

		System.out.println("----------------------------------");

		pm.displayElectronicItems();

		System.out.println("Enter Your choice \n 1. Fooditems \n 2. Electronics \n 3. Apparels");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		TestCompanyProducts testing = new TestCompanyProducts();
		try {
			testing.display(input);
		} catch (NoSuchCategoryAvailable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
