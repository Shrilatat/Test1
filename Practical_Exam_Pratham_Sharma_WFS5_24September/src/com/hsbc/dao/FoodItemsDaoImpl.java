package com.hsbc.dao;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.model.Electronics;
import com.hsbc.model.FoodItems;
import com.hsbc.userdefinedexceptions.ItemAlreadyExists;
import com.hsbc.userdefinedexceptions.ItemNotFound;

public class FoodItemsDaoImpl implements FoodItemsDaoIntf {
	
	Set<FoodItems> dao = new TreeSet<>();
	@Override
	public void addFoodItem(FoodItems item) throws ItemAlreadyExists {
		int flag =1;
		for(FoodItems a:dao) {
			if(item.getItemCode()==a.getItemCode()) {
				flag=0;
			}
			else {
				flag=1;
			}
		}
		if(flag>0) {
			dao.add(item);
			System.out.println("Item Succesfully Added");
		}	
		else
			throw new ItemAlreadyExists();

		
	}

	@Override
	public void deleteFoodItem(int itemCode) throws ItemNotFound {
		int flag =0;
		FoodItems removeObj=null;
		for(FoodItems a:dao) {
			if(itemCode==a.getItemCode()) {
				flag=1;
				removeObj=a;
			}
			else {
				flag=0;
				
			}
		}
		if(flag>0) {
			dao.remove(removeObj);
			System.out.println("Item Succesfully Added");
		}	
		else
			throw new ItemNotFound();
	}

	@Override
	public void addQuantity(int itemCode, int quantity) {
		for(FoodItems a: dao) {
			if(a.getItemCode()==itemCode) {
				int newquantity=a.getQuantity()+quantity;
				a.setQuantity(newquantity);	
			}
		}
	}

	@Override
	public void reduceQuantity(int itemCode, int quantity) {
		for(FoodItems a: dao) {
			if(a.getItemCode()==itemCode) {
				int newquantity=a.getQuantity()-quantity;
				a.setQuantity(newquantity);	
			}
		}
	}

	@Override
	public void displayAllItems() {
		for(FoodItems a: dao) {
			System.out.println(a);
		}
	}

	@Override
	public void displayTop3() {
		
	}

}
