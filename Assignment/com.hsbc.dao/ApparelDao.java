package com.hsbc.practical;

import java.util.Scanner;
import java.util.TreeSet;

public class ApparelDao implements ApparelIntf {

	TreeSet<Apparel> apparels = new TreeSet<>();
	
	public void addApparel() throws ItemAlreadyExistException {
		
		int itemCode;
		String itemName;
		int quantity;
		String size;
		String material;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter item code:");
		itemCode = in.nextInt();
		if(apparels.contains(itemCode))
			throw new ItemAlreadyExistException();
		
		System.out.println("Enter item name:");
		itemName = in.next();
		System.out.println("Enter quantity:");
		quantity = in.nextInt();
		System.out.println("Enter size:");
		size = in.next();
		System.out.println("Enter Material:");
		material = in.next();
		
		apparels.add(new Apparel(itemCode, itemName, quantity, size, material));
	}
	
	public void display() {
		int count = 0;
		for (Apparel apparel : apparels) {
			if(count > 3)
				break;
			System.out.println(apparel);
			count++;
		}
	}
}
