package Wiew.commands;

import java.io.Console;

public class SortName extends Command {
    public SortName(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сортировка семьи по имени. ";
    }

    @Override
    public void execute() {
        super.getConsole().sortFamilyName();
    }
}
