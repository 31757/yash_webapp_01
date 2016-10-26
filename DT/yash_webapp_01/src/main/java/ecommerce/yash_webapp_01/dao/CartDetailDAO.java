package ecommerce.yash_webapp_01.dao;

import java.util.List;

import ecommerce.yash_webapp_01.model.CartDetailModel;

public interface CartDetailDAO {
	public List<CartDetailModel> getAll();
	void insert(CartDetailModel  c);
	CartDetailModel get(int cid);
	void update(CartDetailModel c);
	public void delete(int cid);
}
