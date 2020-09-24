/**
 * 
 */
package com.test.service;

import com.test.Dao.ApparelDao;
import com.test.Dao.ElectronicDao;
import com.test.Dao.FoodDao;
import com.test.entity.Apparel;
import com.test.entity.Electronics;
import com.test.entity.FoodItems;

/**
 * @author siddhant nilesh shah
 *
 */
public class TestItems {
	public static void main(String[] args) {
		FoodDao food = new FoodDao();
		ApparelDao app = new ApparelDao();
		ElectronicDao elec = new ElectronicDao();

		elec.addItems(new Electronics(1013, 3000, 12, 100, "TV"));
		elec.addItems(new Electronics(1026, 8000, 24, 97, "Mobile"));
		//elec.generateReport();

		app.addItems(new Apparel(222,3000,50,"TShirt","LARGE","COTTON"));
		app.addItems(new Apparel(432,2000,32,"Shirt","Medium","COTTON"));
		//app.generateReport();
		
		

	}

}
