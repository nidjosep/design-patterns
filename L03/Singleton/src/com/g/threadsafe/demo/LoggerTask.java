package com.g.threadsafe.demo;


import com.f.threadsafe.singleton.Logger;

public class LoggerTask implements Runnable {

    private final String fileName;

    public LoggerTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            Logger.getInstance(fileName).write(Thread.currentThread().getName() + ": Action " + i);
        }
    }
}
