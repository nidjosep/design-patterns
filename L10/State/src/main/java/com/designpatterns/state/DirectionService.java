package com.designpatterns.state;

public class DirectionService {
    private TravelMode travelMode;

    public DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public int getEta() {
        return travelMode.getEta();
    }
}
