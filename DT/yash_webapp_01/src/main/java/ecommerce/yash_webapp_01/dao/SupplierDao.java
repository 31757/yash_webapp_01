package ecommerce.yash_webapp_01.dao;

import java.util.List;


import ecommerce.yash_webapp_01.model.SupplierModel;

public interface SupplierDao {
	public List<SupplierModel> getAll();

	public void insert(SupplierModel p);

	public void update(SupplierModel p);

	public SupplierModel getById(int id);

	public void delete(int id);
}
