package factory;

public class GregorianCalendar implements Calendar {
    public void addEvent(Event event) {
        System.out.println("Adding an event on the given date in the Gregorian factory.Calendar.");
    }
}
