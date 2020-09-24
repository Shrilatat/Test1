package com.hsbc.dao;

import java.util.Comparator;

import com.hsbc.model.Items;

public class MySalesComp implements Comparator<Items>{
	
	@Override
	public int compare(Items o1, Items o2) {
	if(o1.getSold()<o2.getSold()) {
		return 1;
	}
	else {
		return -1;
	}
}}
