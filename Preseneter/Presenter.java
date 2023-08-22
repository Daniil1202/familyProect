import Human.Famili;
import Human.Human;
import Wiew.View;
import fileheandler.Fileheandler;
import model.Service;

public class Presenter {
    private View view;
    private Fileheandler serialize;
    private Famili<Human> familyConnect;
    private Service service;
    

public Presenter( Service service, View view, Famili<Human> familyConnect, Fileheandler serialize
){
        this.familyConnect = familyConnect;
        this.view = view;
        this.serialize = serialize;
        service = new Service();
        
        view.setPresenter(this);
        
    }
    public void addHumanNew(String name, String sex, int age){
        service.addHumanNew(name, sex, 0);
         
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
    public void sortFamilyName() {
        service.sortFamilyName().sort(null);
        view.print("Сортировка завершена !");
    }

    public void sortFamilyAge() {
        service.sortFamilyAge().sort(sortAge);
        view.print("Сортировка завершена !");

    }
    
    public void saveFamily() {
        familyConnect.saveObject(serialize);
        view.print("Семейное древо сохранено !");
    }

    public void loadFamily() {
        serialize.load("TreeFamily.data");
    }


}
