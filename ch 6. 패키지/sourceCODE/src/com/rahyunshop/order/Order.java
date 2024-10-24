package com.rahyunshop.order;

import com.rahyunshop.product.Product;
import com.rahyunshop.user.User;

public class Order {
    User user = new User();
    Product product = new Product();

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
