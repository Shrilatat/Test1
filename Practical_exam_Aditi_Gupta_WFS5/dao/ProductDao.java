package com.hsbc.dao;

/**
 * Data Access Layer comprising of ProductDao class to access the data source.In our case we access the TreeSet
 */
import java.util.TreeSet;

import com.hsbc.models.Apparel;
import com.hsbc.models.Electronics;
import com.hsbc.models.FoodItems;

public class ProductDao implements ProductIntfDao {
	TreeSet<FoodItems> foodSet = new TreeSet<>();
	TreeSet<Apparel> apparel = new TreeSet<>();
	TreeSet<Electronics> electronic = new TreeSet<>();

	@Override
	public void addFood(FoodItems food) {
		// TODO Auto-generated method stub
		foodSet.add(food);
	}

	@Override
	public void deleteFood(FoodItems food) throws NoProductFoundException {
		// TODO Auto-generated method stub
		int k = 0;
		for (FoodItems f : foodSet) {
			if (f == food)
				foodSet.remove(food);
		}
		if (k == 0)
			throw new NoProductFoundException("No such Product Available");
	}

	@Override
	public void showFood() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++)
			System.out.println(foodSet);
	}

	@Override
	public void addApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		apparel.add(apparel);
	}

	@Override
	public void deleteApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		int k = 0;
		for (Apparel a : apparel) {
			if (a == apparel)
				foodSet.remove(a);
		}
		if (k == 0)
			throw new NoProductFoundException("No such Product Available");
	}

	@Override
	public void showApparel() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++)
			System.out.println(apparel);
	}

	@Override
	public void addElectronic(Electronics electronic1) {
		// TODO Auto-generated method stub
		electronic.add(electronic1);
	}

	@Override
	public void deleteElectronic(Electronics electronic1) {
		// TODO Auto-generated method stub
		int k = 0;
		for (Electronics e : electronic) {
			if (e == electronic1)
				electronic.remove(e);
		}
		if (k == 0)
			throw new NoProductFoundException("No such Product Available");
	}

}

	@Override
	public void showElectronic() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++)
			System.out.println(electronic);
	}

}
