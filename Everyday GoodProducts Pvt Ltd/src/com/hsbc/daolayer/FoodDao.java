package com.hsbc.daolayer;

//Author:Amisha
//Date:23/09/2020
//Purpose:to add and get reports

import java.util.*;

import com.hsbc.entityClass.FoodPojo;
import com.hsbc.myExceptions.CategoryMissingException;
import com.hsbc.myExceptions.ItemCodeExistsException;

public class FoodDao {

	public static Set<FoodPojo> foods = new TreeSet<>();

	public void addNewItems(FoodPojo obj) throws ItemCodeExistsException {
		int flag = 0;
		for (FoodPojo food : foods) {
			if (food.getItemCode() == obj.getItemCode())
				flag++;
		}
		if (flag == 0)
			foods.add(obj);
		else
			throw new ItemCodeExistsException("Allready existing Items cannot be added again.");

	}

	public void getReportData(FoodPojo obj) throws CategoryMissingException {
		int flag = 0;
		for (FoodPojo food : foods) {
			if (food.getItemCode() == obj.getItemCode())
				flag++;
		}
		if (flag != 0)
			System.out.println(foods);
		else
			throw new CategoryMissingException("No such Category found.");

	}
}
