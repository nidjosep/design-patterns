package com.designpatterns.state;

class TransitMode implements TravelMode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA [Transit mode]");
        return 3;
    }
}