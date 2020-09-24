package com.hsbc.dao;

/**
 * @author bk
 * purpose: Implementation of classes
 */
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.model.Apparel;
import com.hsbc.model.Electronic;
import com.hsbc.model.FoodItem;
import com.hsbc.model.Product;

public class ProductDaoImpl implements ProductDaoIntf {

	// Using treeset as it will saved in a sorted way
	TreeSet<Product> apparelsList = new TreeSet<>();
	TreeSet<Product> foodItemsList = new TreeSet<>();
	TreeSet<Product> electronicsList = new TreeSet<>();

	// Initialzing with some default data
	public ProductDaoImpl() {
		this.initializeCatalog();
	}

	@Override
	public void addItem() {

		return;
	}

	@Override
	public void displayReport(String category) {
		if (category.equals("Food items")) {
			iterateOverSet(foodItemsList);
		}
		if (category.equals("Apparels")) {
			iterateOverSet(apparelsList);
		}
		if (category.equals("Electronics")) {
			iterateOverSet(electronicsList);
		}

	}

	public void initializeCatalog() {
		Collections.addAll(apparelsList, new Apparel(111, "T-Shirt", 50, "Large", "Cotton", 50),
				new Apparel(112, "Shirt", 60, "Large", "Cotton", 60),
				new Apparel(113, "Pant", 70, "Large", "Cotton", 70),
				new Apparel(114, "Jeans", 80, "Large", "Cotton", 80));
		Collections.addAll(foodItemsList, new FoodItem(211, "Milk", 50, new Date(), new Date(), true, 50),
				new FoodItem(212, "Curd", 60, new Date(), new Date(), true, 60),
				new FoodItem(213, "Cake", 70, new Date(), new Date(), true, 70));
		Collections.addAll(electronicsList, new Electronic(311, "T-Shirt", 50, 12, 50),
				new Electronic(312, "mobile", 60, 12, 60), new Electronic(313, "Watch", 70, 12, 70),
				new Electronic(314, "IPad", 80, 12, 80));

	}

	// Displaying set
	@Override
	public void iterateOverSet(TreeSet<Product> set) {
		Iterator<Product> iter = set.iterator();
		for (int i = 0; i < 3; i++) {
			System.out.println(iter.next());
		}

	}

}
