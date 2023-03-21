package com.designpatterns.iterator;

public interface Iterable<T> {
    Iterator<T> createIterator();
}
