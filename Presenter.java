public class Presenter {
    private View view;
    private Fileheandler serialize;
    private Famili<Human> familyConnect;
    private HumanComporator sortAge;



    public Presenter( View view, Famili<Human> familyConnect, Fileheandler serialize, HumanComporator sortAge){
        this.familyConnect = familyConnect;
        this.view = view;
        this.serialize = serialize;
        this.sortAge = sortAge;
        view.setPresenter(this);
        
    }

    public void addHumanNew(String name, String sex, int age){
        familyConnect.addFamili(new Human(name,sex,age));
        view.print("Новый член семьи добавлен");
    }
    public void familyPrint(){
        String family = familyConnect.toString();
        view.print(family);

    }
    public void humanSearch(String name){
        Human human = familyConnect.getByName(name);
        if(human == null)
        view.print("Такого человека в семье нет ");
        else{
            String foundHuman = human.toString();
            view.print(foundHuman);
        }
    }

    public void saveFamily() {
        familyConnect.saveObject(serialize);
        view.print("Семейное древо сохранено !");
    }

    public void loadFamily() {
        serialize.load("TreeFamily.data");
    }
    public void sortFamilyName() {
        familyConnect.getFamili().sort(null);
        view.print("Сортировка завершена !");
    }

    public void sortFamilyAge() {
        familyConnect.getFamili().sort(sortAge);
        view.print("Сортировка завершена !");
    }

}
