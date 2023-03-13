package com.designpattern.proxy;

public class Demo {
  public static void main(String[] args) {
    show();
  }
  public static void show() {
    var dbContext = new DbContext();

    ProductProxy productProxy = new ProductProxy(dbContext.getProduct(1).getId(), dbContext);

    productProxy.setName("Updated Name");
    dbContext.saveChanges();

    productProxy.setName("Another name");
    dbContext.saveChanges();
  }
}
