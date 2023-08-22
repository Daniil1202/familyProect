package Wiew.commands;

import java.io.Console;

public class HumanSearch extends Command{
    public HumanSearch(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Поиск человека по имени. ";
    }

    @Override
    public void execute() {
        super.getConsole().humanSearch();
    }
}
