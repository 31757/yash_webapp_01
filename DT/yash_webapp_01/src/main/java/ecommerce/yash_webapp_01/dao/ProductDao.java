package ecommerce.yash_webapp_01.dao;


import java.util.List;

import ecommerce.yash_webapp_01.model.ProductModel;

public interface ProductDAO {
	public List<ProductModel> getAll();
	void insert(ProductModel  p);
	ProductModel get(int pid);
	void update(ProductModel p);
	public void delete(int pid);
}
