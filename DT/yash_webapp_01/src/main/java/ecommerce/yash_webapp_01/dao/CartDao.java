package ecommerce.yash_webapp_01.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ecommerce.yash_webapp_01.model.Cart;

@Repository
public interface CartDao {
	 Cart getCartById(int cartId);

	    Cart validate(int cartId) throws IOException;

	    void update(Cart cart);

}
