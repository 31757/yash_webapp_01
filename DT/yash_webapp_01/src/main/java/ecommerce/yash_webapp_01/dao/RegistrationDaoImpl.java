package ecommerce.yash_webapp_01.dao;

import java.util.List;

import javax.servlet.Registration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ecommerce.yash_webapp_01.model.*;


public class RegistrationDaoImpl implements RegistrationDao {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Registration> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM Registration").list();
	}

	public void insert(RegistrationModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(p);
	}

	public void update(Registration p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
	}

	public Registration getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Registration.class,id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
	}

	
	

}
