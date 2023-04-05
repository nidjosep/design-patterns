package com.designpatterns.state;

class WalkingMode implements TravelMode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA [Walking mode]");
        return 4;
    }
}