package com.designpatterns.iterator;

public class Demo {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.add(new Product(1, "Product 1"));
        collection.add(new Product(2, "Product 2"));
        collection.add(new Product(3, "Product 3"));

        Iterator<Product> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}