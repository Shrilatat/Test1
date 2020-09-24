package com.test.Dao;

import com.test.entity.FoodItems;

/**
 * @author siddhant nilesh shah
 *
 */
public interface FoodDaoIntf {
	void AddfoodItems(FoodItems food);
	void DeletefoodItems(int code);
	void generateReport();

}
