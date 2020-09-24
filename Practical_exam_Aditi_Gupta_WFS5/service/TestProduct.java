package com.hsbc.service;

/**
 * Business layer comprising of TestProduct class to invoke the functions for various products
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

import com.hsbc.dao.ProductDao;
import com.hsbc.models.Apparel;
import com.hsbc.models.Electronics;
import com.hsbc.models.FoodItems;

public class TestProduct {

	public static void main(String[] args) {
		int ch;
		TreeSet<FoodItems> fs = new TreeSet<FoodItems>();
		TreeSet<Apparel> ap = new TreeSet<Apparel>();
		TreeSet<Electronics> el = new TreeSet<Electronics>();
		ProductDao dao = new ProductDao();

		dao.addApparel(new Apparel(104, "Shirt", "medium", "cotton", 20));
		dao.addApparel(new Apparel(105, "T-Shirt", "short", "woolen", 15));
		dao.addApparel(new Apparel(106, "Trouser", "medium", "cotton", 10));
		dao.addApparel(new Apparel(106, "Trouser", "medium", "cotton", 10));
		dao.addApparel(new Apparel(107, "Shorts", "large", "cotton", 50));
		dao.addApparel(new Apparel(108, "Skirt", "medium", "cotton", 10));
		dao.addApparel(new Apparel(109, "Tops", "medium", "cotton", 10));

		dao.addElectronic(new Electronics(12, 101, "TV", 40));
		dao.addElectronic(new Electronics(10, 102, "Cooler", 20));
		dao.addElectronic(new Electronics(16, 103, "LCD", 30));
		dao.addElectronic(new Electronics(10, 104, "Cooler", 50));
		dao.addElectronic(new Electronics(26, 105, "LCD", 90));

		String sDate1 = "10/12/2020";
		Date date1;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String sDate2 = "31/12/2020";
		Date date2;
		try {
			date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// dao.addFood(new FoodItems(40, date1, date2, "Yes", 101, "Milk", 40));
		System.out.println("1,APPAREL 2.ELECTRONIC 3 FOODITEMS");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			dao.showApparel();
		case 2:
			dao.showElectronic();
		case 3:
			dao.showFood();
		}
		try {
			dao.deleteApparel(new Apparel(108, "Skirt", "medium", "cotton", 10));
		} catch (NoProductFoundException e) {
			System.out.println(e);
		}

	}
}
