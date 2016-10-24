package ecommerce.yash_webapp_01.dao;

import java.util.List;

import ecommerce.yash_webapp_01.model.Category;

public interface CategoryDAO {
	List<Category> getAll();
	public Category getCategory(int id);
}
