package com.designpatterns.iterator;

class IteratorMin implements Iterator<Integer> {

  private int min = Integer.MAX_VALUE;
  private final Iterator<Integer> iterator;

  public IteratorMin(Iterator<Integer> iterator) {
    this.iterator = iterator;
  }

  public boolean hasNext() {
    return iterator.hasNext();
  }

  public Integer next() {
    int current = iterator.next();
    min = Math.min(min, current);
    return min;
  }
}