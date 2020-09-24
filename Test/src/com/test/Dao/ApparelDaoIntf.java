/**
 * 
 */
package com.test.Dao;

import com.test.entity.Apparel;

/**
 * @author admin
 *
 */
public interface ApparelDaoIntf {

	void addItems(Apparel app);
	void deleteItems(int code);
	void generateReport();
	
}
