package com.designpatterns.iterator;

public class Demo {

  public static void main(String[] args) {
    IntegerCollection numbers = new IntegerCollection();
    numbers.add(5);
    numbers.add(9);
    numbers.add(1);
    numbers.add(2);
    numbers.add(4);
    numbers.add(3);
    numbers.add(11);
    numbers.add(6);
    numbers.add(-1);

    IteratorMax maxIterator = new IteratorMax(numbers.createIterator());
    IteratorMin minIterator = new IteratorMin(numbers.createIterator());

    System.out.println("Running maximum:");
    while (maxIterator.hasNext()) {
      System.out.println(maxIterator.next());
    }

    System.out.println("Running minimum:");
    while (minIterator.hasNext()) {
      System.out.println(minIterator.next());
    }
  }
}