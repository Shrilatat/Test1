package com.hsbc.dao;

import java.util.TreeSet;

import com.hsbc.model.FoodItems;

public class FoodProDao {
	
	public static void main(String[] args) {
		TreeSet<FoodItems> setFoodIt= new TreeSet<>();
		
		setFoodIt.add(new FoodItems(123,"Chocobar",100,"06/02/2020","06/02/2021",true,10));
		setFoodIt.add(new FoodItems(546,"Pizza",600,"06/02/2020","06/02/2021",true,3));
		setFoodIt.add(new FoodItems(645,"colddrink",470,"06/02/2020","06/02/2021",true,6));
		setFoodIt.add(new FoodItems(895,"burger",500,"06/02/2020","06/02/2021",true,8));
		
	}
	
}
