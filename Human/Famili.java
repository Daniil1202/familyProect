package Human;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fileheandler.Fileheandler;

public  class Famili<E extends Human> implements Iterator<E>, Serializable {
    private List<E> famili;
    
    public Famili() {
        famili = new ArrayList<>();
        
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
    public E getByName(String humanName) {
        for (E human : famili) {
            if (human.getName().equalsIgnoreCase(humanName)) {
                return human;
            }   
        }
            return null;
            
        }
        public List<E> getFamili() {
            return famili;
        }
        
    public String findSpouse(E pers) {
        E spouse = findPerson(pers.getSpouse());
        return String.format("%s %s\nв браке с: %s", pers.getName(), spouse.toString());
    }
    @Override
    public Iterator<E> iterator(){
        return new Iterator<>(famili);
        return famili.iterator();
    }
    public void saveObject(Fileheandler save){
        save.save("Famili.data", this);
    }

}
