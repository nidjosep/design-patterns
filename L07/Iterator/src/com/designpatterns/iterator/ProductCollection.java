package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection implements Iterable<Product> {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}
