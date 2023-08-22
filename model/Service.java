import Human.Famili;
import Human.Human;
import Wiew.View;
import Wiew.commands.SortAge;
import Wiew.commands.SortName;

public class Service {
    private View view;
    private Famili<Human> familyConnect;
    
    

    public Service(){ familyConnect = new Famili<>();}
        
    
    public  void addHumanNew(String name, String sex, int age){
        servise.addFamili(new Human(name,sex,age));
        view.print("Новый член семьи добавлен");

    }
    
    public void sortFamilyName() {
        familyConnect.getFamili().sort(null);
    }

    public void sortFamilyAge() {
        familyConnect.getFamili().sort(sortAge);
        
    }
}


