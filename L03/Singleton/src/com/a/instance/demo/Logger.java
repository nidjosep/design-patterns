package com.a.instance.demo;

public class Logger {
    private final String fileName;

    public Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.printf("Writing log message: Message: %s, Log file: %s, com.multi.logger.Logger: %s\n\n", message, this.fileName, this);
    }
}