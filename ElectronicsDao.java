package com.hsbc.dao;

//interface for electronics
import java.util.List;
import com.hsbc.model.ElectronicsCategory;
public interface ElectronicsDao {
	void addElectronicsItem(ElectronicsCategory electronicsItems);
	List<ElectronicsCategory> getElectronicsItemByQuantity();
}
