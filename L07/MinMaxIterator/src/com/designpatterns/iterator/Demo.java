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
        System.out.println("Minimum value: " + getMin(numbers));
        System.out.println("Maximum value: " + getMax(numbers));
    }

    public static <T extends Comparable<T>> T getMin(Iterable<T> iterable) {
        Iterator<T> iterator = iterable.createIterator();
        T min = iterator.next();
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (current.compareTo(min) < 0) {
                min = current;
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> T getMax(Iterable<T> iterable) {
        Iterator<T> iterator = iterable.createIterator();
        T max = iterator.next();
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }
}