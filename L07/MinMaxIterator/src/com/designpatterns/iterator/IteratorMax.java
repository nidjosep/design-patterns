package com.designpatterns.iterator;

class IteratorMax implements Iterator<Integer> {

  private final Iterator<Integer> iterator;
  private int max = Integer.MIN_VALUE;

  public IteratorMax(Iterator<Integer> iterator) {
    this.iterator = iterator;
  }

  public boolean hasNext() {
    return iterator.hasNext();
  }

  public Integer next() {
    int current = iterator.next();
    max = Math.max(max, current);
    return max;
  }
}