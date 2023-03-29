package com.designpatterns.mediator;

public class TextBox extends UiControl {
    private String content = "";

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        mediator.valueChanged(this);
    }
}
