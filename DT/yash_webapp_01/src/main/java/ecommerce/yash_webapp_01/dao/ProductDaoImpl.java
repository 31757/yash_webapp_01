package ecommerce.yash_webapp_01.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ecommerce.yash_webapp_01.model.ProductModel;


@Transactional
public class ProductDAOImpl implements ProductDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
		
	@Override
	
	
	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from ProductModel").list();
	}

	@Override
	public void insert(ProductModel p) {
		sessionFactory.getCurrentSession().persist(p);		

	}

	@Override
	public ProductModel get(int pid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(ProductModel.class, pid);

	}

	@Override
	public void update(ProductModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);		
	}

	@Override
	public void delete(int pid) {
		sessionFactory.getCurrentSession().remove(get(pid));

	}
	@Override
	public ProductModel getProductById(int productId) {
		// if you'll use load method their

				ProductModel p = sessionFactory.getCurrentSession().get(ProductModel.class, new Integer(productId));
				// Product p = (Product) session1.load(Product.class, new Integer(id));

				return p;
	}
	@Override
	public ProductModel getProductByPrice(int productPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductModel getProductByBand(int productPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductModel> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("from Product WHERE productCategory=?");
		query.setParameter(0, category);
		return query.list();
	}

}
