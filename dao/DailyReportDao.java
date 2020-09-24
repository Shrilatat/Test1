package com.hsbc.dao;
import java.util.Comparator;
/*
 *  autor:abhinav
 * date:24/09/2020
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.hsbc.model.Apparel;
import com.hsbc.model.Electronics;
import com.hsbc.model.FoodItems;
import com.hsbc.model.Items;




public class DailyReportDao implements Comparator<Items>{
	static int sold=0;
TreeSet<FoodItems> set=new TreeSet<>(new MySalesComp());
TreeSet<Apparel> set1=new TreeSet<>(new MySalesComp());
TreeSet<Electronics> set2=new TreeSet<>(new MySalesComp());
public DailyReportDao() {
	set.add(new FoodItems(101,"milk",30,100,sold,"23/09/2020","24/09/2020","yes"));
	set.add(new FoodItems(102,"curd",40,100,sold,"23/09/2020","24/09/2020","yes"));
	set.add(new FoodItems(111,"cake",300,20,sold,"23/09/2020","24/09/2020","no"));
	set1.add(new Apparel(222,"T-shirt",500,200,sold,"Large","Cotton"));
	set1.add(new Apparel(432,"shirt",400,200,sold,"Medium","Cotton"));
	set1.add(new Apparel(325,"Sweater",1000,200,sold,"Medium","Woolen"));
	set2.add(new Electronics(1013,"TV",2000,200,sold,12));
	set2.add(new Electronics(1026,"Mobile",10000,200,sold,24));
	set2.add(new Electronics(1114,"Watch",1000,200,sold,18));

}

public void getFoodDailyReport(int milk,int curd,int cake) {
	int temp;
	Iterator<FoodItems> itr=set.iterator();
	while(itr.hasNext()){
		FoodItems b=itr.next();
		if(b.getItemNAme()=="milk") {
		temp=b.getQuantity()-milk;
		b.setQuantity(temp);
		b.setSold(milk);
		temp=0;
	}
		else if(b.getItemNAme()=="curd") {
			temp=b.getQuantity()-curd;
			b.setQuantity(temp);
			b.setSold(curd);
			temp=0;
		}
		else {
			temp=b.getQuantity()-cake;
			b.setQuantity(temp);
			b.setSold(cake);
			temp=0;
		}
}
	
	Iterator<FoodItems> itr1=set.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
}}
public void getApparelReport(int tshirt,int shirt,int sweater) {
	int temp;
	Iterator<Apparel> itr=set1.iterator();
	while(itr.hasNext()){
		Apparel b=itr.next();
		if(b.getItemNAme()=="T-shirt") {
		temp=b.getQuantity()-tshirt;
		b.setQuantity(temp);
		b.setSold(tshirt);
		temp=0;
	}
		else if(b.getItemNAme()=="shirt") {
			temp=b.getQuantity()-shirt;
			b.setQuantity(temp);
			b.setSold(shirt);
			temp=0;
			
		}
		else {
			temp=b.getQuantity()-sweater;
			b.setQuantity(temp);
			b.setSold(sweater);
			temp=0;
		}
}
	set1.descendingSet();
	Iterator<Apparel> itr1=set1.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
public void getElectronicsReport(int tv,int mobile,int watch) {
	int temp;
	Iterator<Electronics> itr=set2.iterator();
	while(itr.hasNext()){
		Electronics b=itr.next();
		if(b.getItemNAme()=="TV") {
		temp=b.getQuantity()-tv;
		b.setQuantity(temp);
		b.setSold(tv);
		temp=0;
	}
		else if(b.getItemNAme()=="Mobile") {
			temp=b.getQuantity()-mobile;
			b.setQuantity(temp);
			b.setSold(mobile);
			temp=0;
		}
		else {
			temp=b.getQuantity()-watch;
			b.setQuantity(temp);
			b.setSold(watch);
			temp=0;
		}
}
	set2.descendingSet();
	Iterator<Electronics> itr1=set2.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
@Override
public int compare(Items o1, Items o2) {
	if(o1.getSold()<o2.getSold()) {
		return 1;
	}
	else {
		return -1;
	}
	
}
}
