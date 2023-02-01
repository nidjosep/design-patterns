package factory;

public class Scheduler {

    public void schedule(Event event) {
        createCalendar().addEvent(event);
    }

    public Calendar createCalendar() {
        return new GregorianCalendar();
    }
}
