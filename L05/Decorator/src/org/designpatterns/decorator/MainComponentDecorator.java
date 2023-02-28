package org.designpatterns.decorator;

public class MainComponentDecorator extends BaseComponentDecorator {
    public MainComponentDecorator(Component component) {
        super(component);
    }

    @Override
    public String render() {
        return super.render() + " [Main]";
    }
}
