package com.patterns.command;

public class UpdateTextCommand implements Command {

  private final VideoEditor videoEditor;
  private final String prevValue;
  private final String newValue;

  public UpdateTextCommand(VideoEditor videoEditor, String newValue) {
    this.videoEditor = videoEditor;
    this.newValue = newValue;
    this.prevValue = videoEditor.getText();
  }

  @Override
  public void execute() {
    videoEditor.setText(this.newValue);
  }

  @Override
  public void undo() {
    videoEditor.setText(this.prevValue);
  }
}