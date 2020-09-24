package com.hsbc.dao;

import com.hsbc.models.Apparel;
import com.hsbc.models.Electronics;
import com.hsbc.models.FoodItems;

public interface ProductIntfDao {

	void addFood(FoodItems food);

	void deleteFood(FoodItems food) throws NoProductFoundException;

	void showFood();

	void addApparel(Apparel apparel);

	void deleteApparel(Apparel apparel) throws NoProductFoundException;

	void showApparel();

	void addElectronic(Electronics electronic);

	void deleteElectronic(Electronics electronic) throws NoProductFoundException;

	void showElectronic();
}
