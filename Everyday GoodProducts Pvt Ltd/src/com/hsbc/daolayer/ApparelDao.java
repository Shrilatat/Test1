package com.hsbc.daolayer;

//Author:Amisha
//Date:23/09/2020
//Purpose:to add and get reports

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.entityClass.ApparelPojo;
import com.hsbc.myExceptions.CategoryMissingException;
import com.hsbc.myExceptions.ItemCodeExistsException;

public class ApparelDao {

	public static Set<ApparelPojo> apparels = new TreeSet<>();

	public void addNewItems(ApparelPojo obj) throws ItemCodeExistsException {
		int flag = 0;
		for (ApparelPojo apparel : apparels) {
			if (apparel.getItemCode() == obj.getItemCode())
				flag++;
		}
		if (flag == 0)
			apparels.add(obj);
		else
			throw new ItemCodeExistsException("Allready existing Items cannot be added again.");

	}

	public void getReportData(ApparelPojo obj) throws CategoryMissingException {
		int flag = 0;
		for (ApparelPojo apparel : apparels) {
		if (apparel.getItemCode() == obj.getItemCode())
			flag++;
		}
		if(flag != 0)
				System.out.println(apparels);
		else
			throw new CategoryMissingException("No such Category found.");

	}
}
