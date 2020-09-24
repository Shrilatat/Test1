package com.hsbc.dao;

import com.hsbc.model.*;
//Author: Bhavya Chhabra
//Date: 24 Sept 2020
//Purpose: The following file implements the methods for the food items.
public class ApparelItemsImpl {
	HashMap<String, ApparelItems> ApparelItems;

	@Override
	public void addFoodItem(ApparelItems ApparelItem) {
		if (ApparelItems.containsKey(ApparelItem.getItemCode()))
			// throw an exception

			ApparelItems.put(ApparelItem.getItemCode(), ApparelItem);
	}

	@Override
	public List<ApparelItems> getApparelItemsByQuantity() {
		TreeSet<ApparelItems> itemByQuantity = new TreeSet<>();
		List<ApparelItems> report = new ArrayList<>();

		for (Map.Entry en : ApparelItems.entrySet()) {
			itemByQuantity.add((ApparelItems) en.getValue());
		}
		Iterator<ApparelItems> iterator = itemByQuantity.iterator();
		int i = 3;

		while (iterator.hasNext() && i > 0) {
			i--;
			report.add((ApparelItems) iterator.next());
		}

		if (i > 0) {
			// throw exception
			System.out.println("No such Method");
		}
		return report;
	}
}
