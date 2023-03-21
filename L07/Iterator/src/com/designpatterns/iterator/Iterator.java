package com.designpatterns.iterator;

public interface Iterator<T> {
    boolean hasNext();

    Product next();

    void remove();
}
