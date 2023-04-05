package com.designpatterns.state;

class DrivingMode implements TravelMode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA [Driving mode]");
        return 1;
    }
}