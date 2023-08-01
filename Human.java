import java.time.LocalDate;
import java.time.Period;

public abstract class Human {
    private static int count;
    private int id = 0;
    private String name;
    private String surname;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int father;
    private int mother;
    private int spouse;
    private int age;


    static {
        Human.count = 0;
    }

    public Human(String name, String surname, int birthYear,int birthMonth,int birthDay){
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.age = setAge(birthYear, birthMonth, birthDay);
        this.id = ++Human.count;

    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ++Human.count;
    }
    public Human() {
        this.id = ++Human.count;
    }

    public int setAge(int birthYear, int birthMonth, int birthDay){
        LocalDate birtDate = LocalDate.of(birthDay, birthYear,birthMonth);
        LocalDate currenDate = LocalDate.now();
        int age = Period.between(birtDate, currenDate).getYears();
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public String getBirthday() {
        return "День рождения " + name + ' ' + surname + ": " + birthDay + '.'
                + birthMonth + '.' + birthYear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBirthday(int birthDay, int birthMonth, int birthYear) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.age = setAge(birthYear, birthMonth, birthDay);
    }

    public void getMarrid(Human spouse){
        this.spouse = spouse.id;
    }

    public int getSpouse(){
        return spouse;
    }

    public void setMother(int mother){
        this.mother = mother;
    }

    public int getFather(){
        return father;
    }

    public int getMother(){
        return mother;
    }

    public static void setCount(int count) {
        Human.count = count;
    }

    public void setFather(int father) {
        this.father = father;
    }

//           @Override
//         public String getParents() {
//        return String.format("Мать: %s\n" +
//                "Отец: %s", searchById(mother), searchById(father));
//         }

//         public String searchById(int id){
//    if (id == this.id){
//            return "id: " + id + ", " + name + ' ' + surname + ", " + age + " лет";
//         }
//        else {
//            return "не найдено";
//         }
//         }

    public int getId() {
        return id;
    }

    public String getMatrimonialStatus() {
        if (spouse == 0) {
            return "свободен";
        } else {
            return "в браке";
        }
    }

    @Override
    public String toString() {
        return "id: " + id + ", " + name  + ' ' + surname + ", " + age + " лет" + ", "
                + getMatrimonialStatus();
    }
}
