package org.designpatterns.decorator;

public class Editor {
    public void openProject(String path) {
        Component[] components = {
                new MainComponentDecorator(new Artefact("Main")),
                new Artefact("Demo"),
                new ErrorComponentDecorator(new Artefact("EmailClient")),
                new MainComponentDecorator(new Artefact("EmailProvider")),
                //just an example to show we can apply multiple decorators
                new ErrorComponentDecorator(new MainComponentDecorator(new Artefact("DuplicateMainWithErrorClass"))),
        };

        for (var renderer : components)
            System.out.println(renderer.render());
    }
}
