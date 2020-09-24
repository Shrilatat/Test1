package com.hsbc.practical;

import java.util.Scanner;
import java.util.TreeSet;

public class ElectronicsDao implements ElectronicsIntf {

	TreeSet<Electronics> electronics = new TreeSet<>();
	
	public void addElectronics() throws ItemAlreadyExistException {
		int itemCode;
		String itemName;
		int quantity;
		int warranty;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter item code:");
		itemCode = in.nextInt();
		if(electronics.contains(itemCode))
			throw new ItemAlreadyExistException();
		System.out.println("Enter item name:");
		itemName = in.next();
		System.out.println("Enter quantity:");
		quantity = in.nextInt();
		System.out.println("Enter Warranty(in months):");
		warranty = in.nextInt();
		electronics.add(new Electronics(itemCode, itemName, quantity, warranty));
	}
	
	public void display() {
		int count = 0;
		for (Electronics electronics2 : electronics) {
			if(count > 3)
				break;
			System.out.println(electronics2);
			count++;
			
		}
	}
}
