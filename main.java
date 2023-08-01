import java.time.LocalDate;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        Man pers1 = new Man("Сергей","Иванов",   1992, 23, 11);
        System.out.println(pers1);
        Human pers2 = new Female("Мария", "Иванова", 1992,2,1);
        System.out.println(pers2);
        Man pers3 = new Man("Андрей","Иванов", 1991, 11, 12);
        System.out.println(pers3);
        Human pers4 = new Female("Зарина","Иванова", 1990, 3, 2);
        System.out.println(pers4);

//        Famili ivanov = new Famili();
//        ivanov.add(pers1);
//        ivanov.add(pers2);
//        pers1.getMarried(pers2);
//        pers2.getMarried(pers1);
//        ivanov.add(pers3);
//        ivanov.add(pers4);
//
//        pers3.setFather(1);
//        pers3.setMother(2);
//        pers4.setFather(1);
//        pers4.setMother(2);
//        Famili pers5 = new Female("Мария","Петрова",1992,2,1);
//        Man pers6 = new Man("Никита","Петров", 1985,11,7);
//        pers6.getMarried(pers5);
//        pers5.getMarried(pers6);
//        System.out.println(pers5);
//        System.out.println(pers6);
//        Famili petrov = new Famili();
//        petrov.add(pers5);
//        petrov.add(pers6);
//
//        System.out.println(ivanov.findParents(pers3));
//        System.out.println(pers6.getSpouse());
//        System.out.println(petrov.findSpouse(pers6));
    }


}
