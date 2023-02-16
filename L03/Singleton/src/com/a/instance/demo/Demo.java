package com.a.instance.demo;

public class Demo {
    public static void main(String[] args) {
        String fileName = "application.log";
        Logger logger1 = new Logger(fileName);
        Logger logger2 = new Logger(fileName);

        System.out.printf("\nIs it possible to create multiple loggers writing to the same log file concurrently? %s\n", !logger1.equals(logger2) ? "Yes" : "No");

        Logger logger3 = new Logger("logger3.log");
        System.out.printf("Is it possible to create multiple loggers writing to different log files? %s\n", !logger1.equals(logger3) ? "Yes" : "No");
    }
}