package com.g.threadsafe.demo;


public class Demo {
    public static void main(String[] args) {

        Thread threadOne = new Thread(new LoggerTask("threadsafe.log"), "Thread-1");
        Thread threadTwo = new Thread( new LoggerTask("threadsafe.log"), "Thread-2");

        threadOne.start();
        threadTwo.start();
    }
}
