package com.designpatterns.observer;

public interface StockPublisher {
  void addObserver(StockObserver observer);
  void removeObserver(StockObserver observer);
  void notifyObservers();
}
