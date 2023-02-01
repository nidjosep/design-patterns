package factory;

public class Demo {
    public static void show() {
        Scheduler scheduler = new Scheduler();
        scheduler.schedule(new Event());

        Scheduler arabianScheduler = new ArabianScheduler();
        arabianScheduler.schedule(new Event());
    }
}
