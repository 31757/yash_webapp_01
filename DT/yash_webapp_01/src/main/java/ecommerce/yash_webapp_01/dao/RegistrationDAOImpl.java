package ecommerce.yash_webapp_01.dao;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ecommerce.yash_webapp_01.model.RegistrationModel;
@Repository
@Transactional
public class RegistrationDAOImpl implements RegistrationDAO {
	@Autowired	
	private SessionFactory sessionFactory;
	
	@Override
	public List<RegistrationModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM RegistrationModel").list();
	}

	@Override
	public void insert(RegistrationModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(p);
	}

	@Override
	public void update(RegistrationModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
	}

	@Override
	public RegistrationModel getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(RegistrationModel.class,id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
	}

}
