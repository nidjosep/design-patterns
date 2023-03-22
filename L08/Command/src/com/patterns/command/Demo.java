package com.patterns.command;

public class Demo {

  public static void main(String[] args) {
    VideoEditor videoEditor = new VideoEditor();

    System.out.println("Initial State: " + videoEditor);

    videoEditor.updateText("New Text");
    System.out.println("Update Text: " + videoEditor);

    videoEditor.updateContrast(0.9f);
    System.out.println("Update Contrast: " + videoEditor);

    videoEditor.undo();
    System.out.println("Undo (Contrast): " + videoEditor);

    videoEditor.undo();
    System.out.println("Undo (Text): " + videoEditor);
  }
}
