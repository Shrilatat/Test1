package com.hsbc.service;

/*
 * 
 *  autor:abhinav
 * date:24/09/2020
 */

import com.hsbc.dao.DailyReportDao;

public class DailyReportFinal {
public static void main(String[] args) {
	
	DailyReportDao obj=new DailyReportDao();
//	obj.showFoodItems();
//	obj.showApparel();
//	obj.ShowElectronics();
    obj.getFoodDailyReport(40, 20, 12);
    obj.getApparelReport(50, 32, 20);
    obj.getElectronicsReport(100, 97, 54);
    
}
}
