package com.chocksaway.model.command;

public class CommandType implements Command {
    public enum MyCommand {
        ONE,
        TWO,
        THREE
    }

    public static MyCommand execute(String commandValue) {
        return MyCommand.valueOf(commandValue);
    }
}
