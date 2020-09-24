package com.hsbc.dao;

import java.util.TreeSet;

import com.hsbc.model.Apparel;

public class ApparelProDao {
	
	public static void main(String[] args) {
		TreeSet<Apparel> setApparelIt= new TreeSet<>();
		
		setApparelIt.add(new Apparel(222,"T-shirt",50,"Large","Cotton",15000));
		setApparelIt.add(new Apparel(432,"Shirt",32,"Medium","Cotton",1600));
		setApparelIt.add(new Apparel(325,"Sweater",20,"Medium","Woolen",10000));
		
		
		
		
	}

}
