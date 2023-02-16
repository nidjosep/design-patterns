package com.e.mutithread.demo;

public class Demo {
    public static void main(String[] args) {

        Thread threadOne = new Thread(new LoggerTask("multithreaded.log"), "Thread-1");
        Thread threadTwo = new Thread( new LoggerTask("multithreaded.log"), "Thread-2");

        threadOne.start();
        threadTwo.start();
    }
}
