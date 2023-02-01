package factory;

public class ContextMenu {
    private final Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        Component target = component.clone();
        timeline.add(target);
        System.out.println("Duplicating " + component);
    }

}
