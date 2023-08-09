import java.util.Iterator;
import java.util.List;

public abstract class HumanIterator<E extends Human> implements Iterator<E> {
    private int index;
    private List <E> humans;

    public HumanIterator(List <E> humans){
        this.humans = humans;
    }
    @Override
    public boolean hasNext(){
        return humans.size()> index;
    }
    @Override 
    public E next(){
        return humans.get(index++);
    }
    
}