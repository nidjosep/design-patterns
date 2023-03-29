package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements StockObserver {

  private List<Stock> stocks = new ArrayList<>();

  public void addStock(Stock stock) {
    stocks.add(stock);
    stock.addObserver(this);
  }

  public void show() {
    for (var stock : stocks) {
      System.out.println(stock);
    }
  }

  @Override
  public void update(Stock stock) {
    System.out.println("StockListView: " + stock);
  }
}
