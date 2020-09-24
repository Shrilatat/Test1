package com.hsbc.dao;

//Author: Bhavya Chhabra
//Date: 24 Sept 2020
//Purpose: The following file implements the methods for the Electronics items.
import java.util.*;
import com.hsbc.model.*;
public class ElectronicsItemsImpl {
	HashMap<String, ElecronicsItems> ElectroncisItems;

	@Override
	public void addElectronicsItem(ElectronicsItems ElectronicItem) {
		if (ElectronicsItems.containsKey(ElectronicsItem.getItemCode()))
			// throw an exception

			ElectroncisItems.put(ElectronicsItem.getItemCode(), ElectroncisItem);
	}

	@Override
	public List<ElectronicsItems> getElectroncisItemsByQuantity() {
		TreeSet<ElectroncisItems> itemByQuantity = new TreeSet<>();
		List<ElectroncisItems> report = new ArrayList<>();

		for (Map.Entry en : ElectronicsItems.entrySet()) {
			itemByQuantity.add((ElectronicsItems) en.getValue());
		}
		Iterator<ElectroncisItems> iterator = itemByQuantity.iterator();
		int i = 3;

		while (iterator.hasNext() && i > 0) {
			i--;
			report.add((ElectroncisItems) iterator.next());
		}

		if (i > 0) {
			// throw exception
			System.out.println("Nos such Method");
		}
		return report;
	}

}
