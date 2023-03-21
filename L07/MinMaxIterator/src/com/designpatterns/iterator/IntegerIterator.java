package com.designpatterns.iterator;

import java.util.List;

public class IntegerIterator implements Iterator<Integer> {

  private final List<Integer> numbers;
  private int index = 0;

  public IntegerIterator(List<Integer> numbers) {
    this.numbers = numbers;
  }

  @Override
  public boolean hasNext() {
    return index < numbers.size();
  }

  @Override
  public Integer next() {
    return numbers.get(index++);
  }
}
