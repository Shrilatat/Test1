package com.hsbc.test1;
/**
 * Parth Bapat
 * Service class to drive
 */
import com.hsbc.test1.dao.ItemIDPresentException;
import com.hsbc.test1.dao.ProductsDao;
import com.hsbc.test1.dao.ProductsDaoIntf;
import com.hsbc.test1.model.Apparel;
import com.hsbc.test1.model.Electronics;
import com.hsbc.test1.model.FoodItems;

public class TestProducts {
	public static void main(String[] args) {
		ProductsDaoIntf dao=new ProductsDao();
		
		try {
			dao.addFoodItem(new FoodItems(1, "milk", 20, "20-6", "20-7", "yes", 10));
			dao.addFoodItem(new FoodItems(2, "bbbb", 30, "20-6", "20-7", "no", 40));
			dao.addFoodItem(new FoodItems(3, "cccc", 40, "20-6", "20-7", "yes", 50));
			dao.addFoodItem(new FoodItems(4, "dddd", 50, "20-6", "20-7", "no", 70));
		} catch (ItemIDPresentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		dao.showFoodItems();
		
		try {
			dao.addElectronics(new Electronics(5, "TV", 30, 50, 3));
			dao.addElectronics(new Electronics(6, "watch", 40, 50, 3));
			dao.addElectronics(new Electronics(7, "calculator", 30, 50, 3));
			dao.addElectronics(new Electronics(8, "Laptop", 30, 80, 8));
		} catch (ItemIDPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
