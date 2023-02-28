package org.designpatterns.decorator;

public class Artefact implements Component {
    private final String name;

    public Artefact(String name) {
        this.name = name;
    }

    public String render() {
        return name;
    }
}
