package org.designpatterns.decorator;

public class BaseComponentDecorator implements Component {

    private final Component component;
    public BaseComponentDecorator(Component component) {
        this.component = component;
    }
    @Override
    public String render() {
        return component.render();
    }
}
