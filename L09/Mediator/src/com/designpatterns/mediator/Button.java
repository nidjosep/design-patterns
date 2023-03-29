package com.designpatterns.mediator;

public class Button extends UiControl implements SignUpControlStateObserver {
    private boolean isEnabled;

    public Button(Mediator mediator) {
        super(mediator);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void update(boolean enabled) {
        this.isEnabled = enabled;
    }
}