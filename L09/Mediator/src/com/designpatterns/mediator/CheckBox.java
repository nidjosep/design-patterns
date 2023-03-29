package com.designpatterns.mediator;

public class CheckBox extends UiControl {
    private boolean isChecked;

    public CheckBox(Mediator mediator) {
        super(mediator);
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        this.isChecked = checked;
        mediator.valueChanged(this);
    }
}