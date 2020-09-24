/**
 * 
 */
package com.test.Dao;

import java.util.ArrayList;

import com.test.entity.Apparel;


/**
 * @author admin
 *
 */
public class ApparelDao implements ApparelDaoIntf {

	ArrayList<Apparel> app=new ArrayList<Apparel>();
	public void addItems(Apparel item) {
		// TODO Auto-generated method stub
		app.add(item);
	}

	
	public void deleteItems(int code) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void generateReport() {
		// TODO Auto-generated method stub
		for (Apparel apparel : app) {
			//System.out.println(apparel);
		}
	}

	


}
