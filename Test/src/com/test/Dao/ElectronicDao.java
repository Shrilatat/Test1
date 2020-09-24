package com.test.Dao;


/**
 * @author siddhant nilesh shah
 *
 */

import com.test.entity.Electronics;
import java.util.*;
public class ElectronicDao implements ElectronicsIntf{

	
	ArrayList<Electronics> elec=new ArrayList<Electronics>();
	public void addItems(Electronics item) {
		elec.add(item);
	}

	
	public void deleteItems(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void generateReport() {
		// TODO Auto-generated method stub
	for (Electronics electronics : elec) {
		System.out.println(electronics);
	}
		
	}

}
