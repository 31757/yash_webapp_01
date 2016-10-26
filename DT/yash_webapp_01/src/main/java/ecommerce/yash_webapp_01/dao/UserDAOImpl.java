package ecommerce.yash_webapp_01.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ecommerce.yash_webapp_01.model.Cart;
import ecommerce.yash_webapp_01.model.User;


@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory session;

	@Override
	public void insertUser(User user) {
		Cart cart = new Cart();
		cart.setGrandTotal(0);
		cart.setUser(user);
		user.setCart(cart);
		
		session.getCurrentSession().persist(user);
		session.getCurrentSession().persist(user);

	}

	@Override
	public User getUserDetails(String userid) {

		User user = session.getCurrentSession().get(User.class, new String(userid));
		return user;

	}

	@Override
	public User getUById(int customerId) {
		// TODO Auto-generated method stub
		User u = session.getCurrentSession().get(User.class, new Integer(customerId));
		return  u;
	}

	@Override
	public List<User> getAllCustomers() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from User").list();
	}

	@Override
	public User getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		Query query = session.getCurrentSession().createQuery("from User WHERE email=?");
		query.setParameter(0, username);
		return (User)query.getSingleResult();
	}

}