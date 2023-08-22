package model.Comparators;
import java.util.Comparator;

import Human.Human;
import Wiew.commands.SortAge;

public class HumanComporatorByAge<E extends Human> implements Comparator<E> {
    SortAge sortAge;
    @Override
    public int compare(E o1, E o2){
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
