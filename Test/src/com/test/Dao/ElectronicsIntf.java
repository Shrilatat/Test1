package com.test.Dao;

import com.test.entity.Electronics;

public interface ElectronicsIntf {

		void addItems(Electronics elec);
		void deleteItems(int id);
		void generateReport();
}
