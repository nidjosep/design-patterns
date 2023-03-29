package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockPublisher {

  private final String symbol;
  private float price;
  private final List<StockObserver> observers = new ArrayList<>();

  public Stock(String symbol, float price) {
    this.symbol = symbol;
    this.price = price;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
    notifyObservers();
  }

  public void addObserver(StockObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(StockObserver observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (StockObserver observer : observers) {
      observer.update(this);
    }
  }

  @Override
  public String toString() {
    return "Stock{" +
        "symbol='" + symbol + '\'' +
        ", price=" + price +
        '}';
  }
}
