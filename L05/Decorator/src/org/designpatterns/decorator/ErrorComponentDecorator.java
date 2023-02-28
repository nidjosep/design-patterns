package org.designpatterns.decorator;

public class ErrorComponentDecorator extends BaseComponentDecorator {

    public ErrorComponentDecorator(Component component) {
        super(component);
    }

    @Override
    public String render() {
        return super.render() + " [Error]";
    }
}
