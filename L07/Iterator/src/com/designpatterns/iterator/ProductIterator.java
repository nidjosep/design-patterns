package com.designpatterns.iterator;

import java.util.List;

public class ProductIterator implements Iterator<Product> {

    private final List<Product> products;
    private int index = 0;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();
    }

    @Override
    public Product next() {
        return products.get(index++);
    }

    @Override
    public void remove() {
        products.remove(index);
    }
}
