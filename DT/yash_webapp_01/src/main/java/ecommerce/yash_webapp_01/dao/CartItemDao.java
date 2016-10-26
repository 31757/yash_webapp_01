package ecommerce.yash_webapp_01.dao;

import ecommerce.yash_webapp_01.model.Cart;
import ecommerce.yash_webapp_01.model.CartItem;

public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
