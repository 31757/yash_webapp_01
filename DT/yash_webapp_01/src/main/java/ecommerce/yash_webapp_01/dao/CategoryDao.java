package ecommerce.yash_webapp_01.dao;

import java.util.List;

import ecommerce.yash_webapp_01.model.CategoryModel;

public interface CategoryDao {
	public List<CategoryModel> getAll();

	public void insert(CategoryModel p);

	public void update(CategoryModel p);

	public CategoryModel getById(int cid);

	public void delete(int id);
}
