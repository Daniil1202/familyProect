package Wiew.commands;

import java.io.Console;

public class FamilyPrint extends Command {
    
    public FamilyPrint(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Печать семейного древа.";
    }

    @Override
    public void execute() {
        super.getConsole().familyPrint();
    }
}
