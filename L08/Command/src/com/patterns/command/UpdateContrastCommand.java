package com.patterns.command;

public class UpdateContrastCommand implements Command {

  private final VideoEditor videoEditor;
  private final float prevValue;
  private final float newValue;

  public UpdateContrastCommand(VideoEditor videoEditor, float newValue) {
    this.videoEditor = videoEditor;
    this.newValue = newValue;
    this.prevValue = videoEditor.getContrast();
  }

  @Override
  public void execute() {
    videoEditor.setContrast(newValue);
  }

  @Override
  public void undo() {
    videoEditor.setContrast(prevValue);
  }
}