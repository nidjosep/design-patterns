package factory;

public class Clip implements Component {

    public Clip() {
    }

    public Clip(Component component) {
    }

    @Override
    public Component clone() {
        return new Clip(this);
    }

    @Override
    public String toString() {
        return "Clip";
    }
}
