package factory;

public class Demo {
    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        Text text = new Text("Hello");
        Audio audio = new Audio();
        Clip clip = new Clip();

        timeline.add(text);
        timeline.add(audio);
        timeline.add(clip);
        timeline.add(new Text("World"));

        ContextMenu menu = new ContextMenu(timeline);

        menu.duplicate(text);
        menu.duplicate(audio);
        menu.duplicate(clip);

        System.out.println("\nComponents added in the timeline: " +  timeline);
    }
}
