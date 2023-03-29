package com.designpatterns;

public interface StockPublisher {
  void addObserver(StockObserver observer);
  void removeObserver(StockObserver observer);
  void notifyObservers();
}
