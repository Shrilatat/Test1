package com.hsbc.dao;
//interface for Apparel
import com.hsbc.model.ApparelCategory;

import java.util.List;

public interface ApparelDao {
void addApparelItem(ApparelCategory apparelItems);
List<ApparelCategory> getApparelItemByQuantity();
}
