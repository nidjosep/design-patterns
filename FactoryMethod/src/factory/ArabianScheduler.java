package factory;

public class ArabianScheduler extends Scheduler {
    public Calendar createCalendar() {
        return new ArabianCalendar();
    }
}
