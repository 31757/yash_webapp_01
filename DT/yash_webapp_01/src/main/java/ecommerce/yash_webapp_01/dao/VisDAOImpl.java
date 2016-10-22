package ecommerce.yash_webapp_01.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ecommerce.yash_webapp_01.model.VisModel;

@Transactional
public class VisDAOImpl implements VisDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertvis(VisModel v) {
		sessionFactory.getCurrentSession().persist(v);
		// TODO Auto-generated method stub
	}

}
