package com.rahyunshop.order;

import com.rahyunshop.product.Product;
import com.rahyunshop.user.User;

public class OrderSercvice {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
