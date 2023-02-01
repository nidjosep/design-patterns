package factory;

public class Audio implements Component {

    public Audio() {

    }

    public Audio(Component component) {
    }

    @Override
    public Component clone() {
        return new Audio(this);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}
