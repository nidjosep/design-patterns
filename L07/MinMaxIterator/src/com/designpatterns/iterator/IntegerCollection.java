package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollection implements Iterable<Integer> {

  private final List<Integer> numbers = new ArrayList<>();

  public void add(Integer number) {
    numbers.add(number);
  }

  @Override
  public Iterator<Integer> createIterator() {
    return new IntegerIterator(numbers);
  }
}
