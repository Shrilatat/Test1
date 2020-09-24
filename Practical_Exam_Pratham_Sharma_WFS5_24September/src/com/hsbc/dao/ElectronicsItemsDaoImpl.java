package com.hsbc.dao;

import java.util.Set;
import java.util.TreeSet;


import com.hsbc.model.Electronics;
import com.hsbc.userdefinedexceptions.ItemAlreadyExists;
import com.hsbc.userdefinedexceptions.ItemNotFound;

public class ElectronicsItemsDaoImpl implements ElectronicItemDaoIntf{

	Set<Electronics> dao = new TreeSet<>();
	
	@Override
	public void addElectronicItem(Electronics item) throws ItemAlreadyExists {
		int flag =1;
		for(Electronics a:dao) {
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
	public void deleteElectronicItem(int itemCode) throws ItemNotFound {
		int flag =0;
		Electronics removeObj=null;
		for(Electronics a:dao) {
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
		for(Electronics a: dao) {
			if(a.getItemCode()==itemCode) {
				int newquantity=a.getQuantity()+quantity;
				a.setQuantity(newquantity);	
			}
		}
	}

	@Override
	public void reduceQuantity(int itemCode, int quantity) {
		for(Electronics a: dao) {
			if(a.getItemCode()==itemCode) {
				int newquantity=a.getQuantity()-quantity;
				a.setQuantity(newquantity);	
			}
		}
	}

	@Override
	public void displayAllItems() {
		for(Electronics a: dao) {
			System.out.println(a);
		}
	}

	@Override
	public void displayTop3() {
		// TODO Auto-generated method stub
		
	}

}
