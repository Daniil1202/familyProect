package commands;

import java.io.Console;

public class addHuman extends Command {
    public addHuman(Console console ){
        super(console);
    }
    @Override
    public String description() {
        return "Добавление человека в семью. ";
    }

    @Override
    public void execute() {
        getConsole().addHumanNew();
    }
    
    
}
