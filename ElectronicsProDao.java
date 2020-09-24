package com.hsbc.dao;


import java.util.TreeSet;

//import com.hsbc.model.Apparel;
import com.hsbc.model.Electronics;

public class ElectronicsProDao {
	
	public static void main(String[] args) {
		TreeSet<Electronics> setAEleclIt= new TreeSet<>();
		
		setAEleclIt.add(new Electronics(1013,"TV",150000,12,100));
		
		setAEleclIt.add(new Electronics(1026,"Mobile",150000,24,97));
		
		setAEleclIt.add(new Electronics(1114,"Watch",150000,18,54));
		
		
		
	}
}
