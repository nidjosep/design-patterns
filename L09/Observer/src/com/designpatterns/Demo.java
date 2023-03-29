package com.designpatterns;

public class Demo {

  public static void main(String[] args) {
    Stock abc = new Stock("ABC", 1.00f);
    Stock def = new Stock("DEF", 2.00f);

    StatusBar statusBar = new StatusBar();
    statusBar.addStock(abc);
    statusBar.addStock(def);

    StockListView stockListView = new StockListView();
    stockListView.addStock(abc);
    stockListView.addStock(def);

    System.out.println("\n\nChanging abc price to 1.50");
    abc.setPrice(1.50f);

    System.out.println("\n\nChanging def price to 2.50");
    def.setPrice(2.50f);

    System.out.println("\n\nStatus Bar with the latest values:");
    statusBar.show();

    System.out.println("\n\nStock List View with the latest values:");
    stockListView.show();
  }
}
