package com.hsbc.dao;

import java.util.Iterator;
import java.util.TreeSet;

import com.hsbc.model.Item;

//Author: Ritakshi Sen
//Purpose : This class contains the implementation of the function calls

public class ItemsDaoImpl implements ItemsDaoIntf {
    
	
	
	@Override
	public void showTopItems(TreeSet<Item> items) {
		
		Iterator<Item> itr=items.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
	}
	
	//Using Comparator to sort by quantity
	
	

	

}
