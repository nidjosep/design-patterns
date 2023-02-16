package com.f.threadsafe.singleton;

import java.util.HashMap;
import java.util.Map;

public class Logger {

    private static final Map<String, Logger> instances = new HashMap<>();
    private final String fileName;

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public static Logger getInstance(String fileName) {
        if (!instances.containsKey(fileName)) {
            // file name specific lock
            // using intern to ensure we are referring to a unique allocation in the string pool
            synchronized (fileName.intern()) {
                if (!instances.containsKey(fileName)) {
                    instances.put(fileName, new Logger(fileName));
                }
            }
        }
        return instances.get(fileName);
    }

    public void write(String message) {
        System.out.printf("Writing log message => Message: %s, Log: %s, Instance: %s\n\n", message, this.fileName, this);
    }
}