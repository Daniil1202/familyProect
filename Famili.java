import java.util.ArrayList;

public class Famili {
    private ArrayList<Human> famili = new ArrayList<>();
    
    public Famili() {
        
    }
@Override
public String toString(){
    return "Семья :" + famili;
}
public void add(Human pers){
    famili.add(pers);
}
private Human findPerson(int id){
    for(Human human : famili){
        if(human.getId() == id)
        return human;
    }
throw new IllegalStateException("Такого человека в семье нет");
    }

    public String findParents(Human pers) {
        Human mother = findPerson(pers.getMother());
        Human father = findPerson(pers.getFather());
        return String.format("%s %s\nМать - %s\nОтец - %s", pers.getName(), mother.toString(), father.toString());
    }

    public String findSpouse(Human pers) {
        Human spouse = findPerson(pers.getSpouse());
        return String.format("%s %s\nв браке с: %s", pers.getName(), spouse.toString());
    }

}
