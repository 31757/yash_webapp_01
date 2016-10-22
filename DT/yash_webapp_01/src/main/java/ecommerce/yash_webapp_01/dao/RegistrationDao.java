package ecommerce.yash_webapp_01.dao;

import java.util.List;

import javax.servlet.Registration;

import ecommerce.yash_webapp_01.model.*;




public interface RegistrationDao {
	
	
	public List<Registration> getAll();
	public void insert(RegistrationModel c);
	public void update(Registration p);
	public Registration getById(int id);
	public void delete(int id);
	 
}
