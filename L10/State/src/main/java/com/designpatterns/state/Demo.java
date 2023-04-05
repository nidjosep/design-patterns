package com.designpatterns.state;

public class Demo {
    public static void main(String[] args) {
        TravelMode driving = new DrivingMode();
        DirectionService directionService = new DirectionService(driving);
        displayETA(directionService);

        TravelMode bicycling = new BicyclingMode();
        directionService.setTravelMode(bicycling);
        displayETA(directionService);

        TravelMode transit = new TransitMode();
        directionService.setTravelMode(transit);
        displayETA(directionService);

        TravelMode walking = new WalkingMode();
        directionService.setTravelMode(walking);
        displayETA(directionService);
    }

    private static void displayETA(DirectionService directionService) {
        System.out.printf("ETA: %s\n\n", directionService.getEta());
    }
}
