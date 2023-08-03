import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class fileheandler implements LoadFrom, SaveAs {
    public Serializable load(String path){
        Serializable human = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(
            new FileInputStream(path))){
                human = (Serializable) objectInputStream.readObject();
                System.out.println("Загрузка семейного дерева завершена");
            }
        catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return human;
    }
    public void save(String path, Serializable object){
        try {ObjectOutputStream objectOutputStream = new ObjectOutputStream(
            new FileOutputStream(path));
            objectOutputStream.writeObject(object);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
    
}
