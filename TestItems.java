package com.hsbc.service;
//Author: Bhavya Chhabra

//Date: 24 Sept 2020
//Purpose: The following file implements the methods with respect to the input by the user.

import java.util.ArrayList;
import java.util.Scanner;
import com.hsbc.dao.*;
import com.hsbc.model.*;

public class TestItems {

	public static void main(String[] args) {
		// For Food Items

		FoodItemCategory foodItems = new FoodItemCategory();

		Scanner sc = new Scanner(System.in);

		String category = sc.nextLine();

		if (category.equals("FoodItems")) {
			ArrayList<FoodItemCategory> report = (ArrayList<FoodItemCategory>) FoodItemImpl.getFoodItemsByQuantity();
		}
		// For Apparel Items

		ApparelItemCategory apparelItems = new ApparelItemCategory();

		Scanner ad = new Scanner(System.in);

		String category = ad.nextLine();

		if (category.equals("ApparelItems")) {
			ArrayList<ApparelItemCategory> report = (ArrayList<ApparelItemCategory>) ApparelItemImpl
					.getApparelItemsByQuantity();
		}

		// For Electronics Items

		ElectronicsItemCategory electronicsItems = new ElectronicsItemCategory();

		Scanner bc = new Scanner(System.in);

		String category = bc.nextLine();

		if (category.equals("ElectronicsItems")) {
			ArrayList<ElectronicsItemCategory> report = (ArrayList<ElectronicsItemCategory>) ElectroincsItemImpl
					.getElectronicsItemsByQuantity();
		}
	}

}
