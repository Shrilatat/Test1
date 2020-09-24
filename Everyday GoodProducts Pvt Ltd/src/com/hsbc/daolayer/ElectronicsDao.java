package com.hsbc.daolayer;

//Author:Amisha
//Date:23/09/2020
//Purpose:to add and get reports

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.entityClass.ElectronicsPojo;
import com.hsbc.myExceptions.CategoryMissingException;
import com.hsbc.myExceptions.ItemCodeExistsException;

public class ElectronicsDao {

	public static Set<ElectronicsPojo> electronics = new TreeSet<>();

	public void addNewItems(ElectronicsPojo obj) throws ItemCodeExistsException {
		int flag = 0;
		for (ElectronicsPojo electronic : electronics) {
			if (electronic.getItemCode() == obj.getItemCode())
				flag++;
		}
		if (flag == 0)
			electronics.add(obj);
		else
			throw new ItemCodeExistsException("Allready existing Items cannot be added again.");

	}

	public void getReportData(ElectronicsPojo obj) throws CategoryMissingException {
		int flag = 0;
		for (ElectronicsPojo electronic : electronics) {
			if (electronic.getItemCode() == obj.getItemCode())
				flag++;
		}
		if (flag != 0)
			System.out.println(electronics);
		else
			throw new CategoryMissingException("No such Category found.");

	}
}