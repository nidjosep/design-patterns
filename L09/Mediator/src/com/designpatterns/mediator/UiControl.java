package com.designpatterns.mediator;

public abstract class UiControl {
    protected Mediator mediator;

    public UiControl(Mediator mediator) {
        this.mediator = mediator;
    }
}
