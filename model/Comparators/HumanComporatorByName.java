package model.Comparators;
import java.util.Comparator;

import Human.Human;
import commands.SortName;

public class HumanComporatorByName <E extends Human> implements Comparator<E> {
     
    @Override
    public int compare(E o1, E o2){
        return o1.getName()compareTo(o2.getName());
    } 
    
}
