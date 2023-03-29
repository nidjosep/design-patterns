package com.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class SignUpDialogBox implements Mediator {
    private final TextBox userInput;
    private final TextBox passwordInput;
    private final CheckBox termsCheck;
    private final Button signUpButton;
    private List<SignUpControlStateObserver> observers = new ArrayList<>();

    public SignUpDialogBox() {
        this.userInput = new TextBox(this);
        this.passwordInput = new TextBox(this);
        this.termsCheck = new CheckBox(this);
        this.signUpButton = new Button(this);

        registerObserver(this.signUpButton);
    }

    @Override
    public void valueChanged(UiControl uiControl) {
        System.out.println("[Mediator Fn] Value changed for the control " + uiControl.toString());
        notifyObservers();
    }

    private void notifyObservers() {
        boolean signUpControlState = !userInput.getContent().isEmpty() &&
                !passwordInput.getContent().isEmpty() &&
                termsCheck.isChecked();
        for (SignUpControlStateObserver observer : observers) {
            observer.update(signUpControlState);
        }
    }

    private void registerObserver(SignUpControlStateObserver observer) {
        observers.add(observer);
    }

    public void simulateUserInteraction() {
        userInput.setContent("Nidhin Joseph");
        passwordInput.setContent("pass123");
        termsCheck.setChecked(true);

        System.out.println("Button is enabled: " + signUpButton.isEnabled());
    }
}
