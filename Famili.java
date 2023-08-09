import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class Famili<E extends Human> implements Iterator<E>, Serializable {
    private ArrayList<E> famili = new ArrayList<>();
    
    public Famili() {
        
    }
@Override
public String toString(){
    return "Семья :" + famili;
}
public void add(E pers){
    famili.add(pers);
}
private E findPerson(int id){
    for(E human : famili){
        if(human.getId() == id)
        return human;
    }
    
throw new IllegalStateException("Такого человека в семье нет");
    }

    public String findParents(E pers) {
        E mother = findPerson(pers.getMother());
        E father = findPerson(pers.getFather());
        return String.format("%s %s\nМать - %s\nОтец - %s", pers.getName(), mother.toString(), father.toString());
    }

    public String findSpouse(E pers) {
        E spouse = findPerson(pers.getSpouse());
        return String.format("%s %s\nв браке с: %s", pers.getName(), spouse.toString());
    }
    @Override
    public Iterator<E> iterator(){
        return new HumanIterator<>(famili);
        return famili.iterator();
    }
    public void saveObj(fileheandler save){
        save.save("Famili", this);
    }

}
