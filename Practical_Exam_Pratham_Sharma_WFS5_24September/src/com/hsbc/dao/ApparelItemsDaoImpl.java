package com.hsbc.dao;

import java.util.*;

import com.hsbc.model.Apparel;
import com.hsbc.userdefinedexceptions.ItemAlreadyExists;
import com.hsbc.userdefinedexceptions.ItemNotFound;

public class ApparelItemsDaoImpl implements ApparelItemsDaoIntf{
	
	Set<Apparel> dao = new TreeSet<Apparel>();
	
	@Override
	public void addApparelItem(Apparel item) throws ItemAlreadyExists {
		int flag =1;
		for(Apparel a:dao) {
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
	public void deleteApparelItem(int itemCode) throws ItemNotFound {
		int flag =0;
		Apparel removeObj=null;
		for(Apparel a:dao) {
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
		for(Apparel a: dao) {
			if(a.getItemCode()==itemCode) {
				int newquantity=a.getQuantity()+quantity;
				a.setQuantity(newquantity);	
			}
		}
		
	}

	@Override
	public void reduceQuantity(int itemCode, int quantity) {
		for(Apparel a: dao) {
			if(a.getItemCode()==itemCode) {
				int newquantity=a.getQuantity()-quantity;
				a.setQuantity(newquantity);	
			}
		}
		
	}

	@Override
	public void displayAllItems() {
		for(Apparel a: dao) {
			System.out.println(a);
		}
		
	}

	@Override
	public void displayTop3() {
		
	}
	
}
