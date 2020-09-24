package com.hsbc.services;

import java.util.Scanner;
import com.hsbc.model.*;
import com.hsbc.dao.*;
public class TestProducts throws NoCategoryExistException() {
	
	
	
	public static void main(String[] args) {
		String category= null;
		
		System.out.println("Enter the Category of the product");
		Scanner sc= new Scanner(System.in);
		category= sc.nextLine();
		
		if(category.equals("Food"))
		{
			FoodProDao fpobj= new FoodProDao();
			fpobj.display();
		}
		else if(category.equals("Apparel"))
		{
			ApparelProDao apobj= new ApparelProDao();
			
		}
		
		else if(category.equals("Electonics"))
		{
			ElectronicsProDao epobj= new ElectronicsProDao();
		}
		
		else throw new NoCategoryExistException();
		
		
	}

}
