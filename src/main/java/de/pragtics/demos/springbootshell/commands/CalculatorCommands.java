package de.pragtics.demos.springbootshell.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CalculatorCommands {

    @ShellMethod(value = "Add two integers together.", group = "Rechner")
    public int add(int left, int right) {

        return left + right;
    }

    @ShellMethod(value = "Subtracts on integer from another.", group = "Rechner")
    public int subtract(int left, int right) {
        return left - right;
    }
}
