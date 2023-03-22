package com.patterns.command;

public class VideoEditor {

  private final Invoker invoker = new Invoker();
  private float contrast = 0.5f;
  private String text;

  public void setText(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public float getContrast() {
    return contrast;
  }

  public void setContrast(float contrast) {
    this.contrast = contrast;
  }

  public void updateContrast(float contrast) {
    invoker.execute(new UpdateContrastCommand(this, contrast));
  }

  public void updateText(String text) {
    invoker.execute(new UpdateTextCommand(this, text));
  }

  public void undo() {
    invoker.undo();
  }

  @Override
  public String toString() {
    return "VideoEditor{" + "contrast=" + contrast + ", text='" + text + '\'' + '}';
  }
}