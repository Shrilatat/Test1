package com.hsbc.view;


import java.util.Scanner;

import com.hsbc.service.ItemDaoOps;

public class MainClass {
	ItemDaoOps items= new ItemDaoOps();
	
	System.out.println("Enter number choice for your category");
	int choice;
	Scanner s = new Scanner(System.in);
	choice = s.nextInt();
	switch(choice) {
	case 1:
		items.chooseCategory(choice);
		break;
	case 2: 
		items.chooseCategory(choice);
		break;
	case 3:
		items.chooseCategory(choice));
	}
}
