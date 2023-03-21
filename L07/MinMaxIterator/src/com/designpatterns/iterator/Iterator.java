package com.designpatterns.iterator;

public interface Iterator<T> {
    boolean hasNext();

    T next();

    void remove();
}
