package factory;

public class Text implements Component {
    private final String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component clone() {
        return new Text(this.content);
    }

    @Override
    public String toString() {
        return String.format("Text - %s", content);
    }
}
