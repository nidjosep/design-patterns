package com.patterns.command;

import java.util.Stack;

public class Invoker {

  private final Stack<Command> commandStack;

  public Invoker() {
    commandStack = new Stack<>();
  }

  public void execute(Command command) {
    command.execute();
    commandStack.push(command);
  }

  public void undo() {
    if (!commandStack.isEmpty()) {
      Command command = commandStack.pop();
      command.undo();
    }
  }
}
