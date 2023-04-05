package com.designpatterns.state;

class BicyclingMode implements TravelMode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA [Bicycling mode]");
        return 2;
    }
}