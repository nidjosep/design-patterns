public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating ETA (driving)");
            return 1;
        } else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating ETA (bicycling)");
            return 2;
        } else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating ETA (transit)");
            return 3;
        } else {
            System.out.println("Calculating ETA (walking)");
            return 4;
        }
    }
}