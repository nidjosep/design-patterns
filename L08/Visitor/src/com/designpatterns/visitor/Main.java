package com.designpatterns.visitor;

public class Main {
    public static void main(String[] args) {
        var wavFile = WavFile.read("file.wav");

        System.out.println("Applying noise reduce filter:");
        wavFile.applyFilter(new NoiseReducerFilterVisitor());

        System.out.println("\nApplying reverb filter:");
        wavFile.applyFilter(new ReverbFilterVisitor());

        System.out.println("\nApplying normalize filter:");
        wavFile.applyFilter(new NormalizeFilterVisitor());

    }
}