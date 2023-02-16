package com.b.singleton.logger;

public class Demo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance("one.log");
        Logger logger2 = Logger.getInstance("one.log");
        System.out.printf("Can we use the singleton pattern to ensure only one single logger is instantiated for a given file? %s\n", logger1.equals(logger2) ? "Yes" : "No");
    }
}
