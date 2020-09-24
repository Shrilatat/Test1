package com.hsbc.GoodProducts;
/*
 * Author:Pooja Gambhir
 * Purpose: This code is used to get inputs from the user
 * 
 */
import java.util.Scanner;

public class TestProductOp {

	public static void main(String[] args) {
		int catN=0;
		int ans=0;
		Scanner s=new Scanner(System.in);
		ProductDAO p=new ProductDAO();
		
		p.addFood(new FoodItems(126, "Maggie", 20, 6,"20-9-2020","26-9-2021", true));
		p.addFood(new FoodItems(202, "Eggs", 25, 4,"2-7-2020","6-8-2020", false));
		p.addFood(new FoodItems(145, "Pasta", 290, 2,"23-6-2020","25-9-2022", true));
		
		p.addApp(new Apparel(678, "Kurta", 560, 5,"small","cotton"));
		p.addApp(new Apparel(453, "Shirt", 435, 4,"medium","silk"));
		p.addApp(new Apparel(678, "Trouser", 790, 2,"large","small"));
		
		p.addEle(new Electronics(212,"TV", 13470, 5, 6));
		p.addEle(new Electronics(212,"Iron", 8600, 2, 5));
		p.addEle(new Electronics(212,"Fridge", 29000, 3, 2));
		
		
		do {
			System.out.println("Enter your category choice:(Enter Number)");
			System.out.println("1.Food \n 2.Apparel \n 3.Electronics");
			catN=s.nextInt();
		switch(catN)
		{
		case 1: System.out.println("Food items:");
			    p.displayFood();
		        break;
		case 2: System.out.println("Apparel:");
			    p.displayApp();
		        break;
		case 3: System.out.println("Electronics:");
			    p.displayEle();
		        break;
		default: System.out.println("Enter proper choice.");
		}
		System.out.println("Do you want to continue?(yes=1/no=0)");
		ans=s.nextInt();
		}while(ans!=0);
		

	}

}
