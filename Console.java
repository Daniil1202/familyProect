import java.util.Scanner;

public class Console implements View {
    
    private Scanner scan;
    private Presenter presenter;
    private Menu menu;
    private boolean go;

    @Override
    public void start(){
        scan = new Scanner(System.in);
        menu = new Menu(this);
        go = true;

        while (go){
            header();
            menuUi();
            System.out.print("Выберите пункт Меню: ");
            String command = scan.nextLine();
            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            } else{
                System.out.println("Введите число");
            }
        }
    }
    private void header(){
        System.out.println("\n Программа для работы с деревом");
       
    }
    private void menuUi(){
        System.out.println(menu.printMenu());
    }
    public void addHumanNew(){
        System.out.print("Введите имя: ");
        String name = scan();
        System.out.print("Введите пол(муж/жен.): ");
        String sex = scan();
        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(scan());
        presenter.addHumanNew(name,sex,age);
    }
    public void familyPrint(){
        presenter.familyPrint();
    }
    public void humanSearch(){
        System.out.print("Введите имя человека для поиска: ");
        String name = scan();
        presenter.humanSearch(name);
    }
    
    public void saveFamily() {
        presenter.saveFamily();
    }

    public void loadFamily() {
        presenter.loadFamily();
    }

    public void sortFamilyName() {
        presenter.sortFamilyName();
    }

    public void sortFamilyAge() {
        presenter.sortFamilyAge();
    }

    public void end() {
        go = false;
        System.out.println("Досвидания, хорошего дня");
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public String scan() {
        scan = new Scanner(System.in, "Cp6");
        return scan.nextLine();
    }

    private boolean checkInput(String text) {
        return text.matches("[0-9]+");
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }




    // public ConsoleUI(){
    //     presenter = new Presenter(view:this);
    //     scanner = new Scanner(System.in);
    // }

    // @Override
    // public void start(){
    //     System.out.println("Приветствую!");
    //     while (true) {
    //         System.out.println("1. Добавить человека" +
    //                 "2. Получить информацию о дереве" +
    //                 "3. Отсортировать по имени" + 
    //                 "4. Отсортировать по возрасту" +
    //                 "5. Завершить работу");
    //         System.out.println("Выберите действие");
    //         int choice = scanner.nextInt(); 
    //         switch(choice){
    //             case 1:
    //                 addHuman();
    //                 break;
    //             case 2:
    //             case 3:
    //             case 4:
    //             case 5:

    //         }          
    //     }

    // }
    // public void addHuman(){
    //     System.out.println("Укажите имя человека");
    //     String name = scanner.nextLine();
    //     System.out.println("Укажите возраст человека");
    //     int age = scanner.nextInt();
    //     presenter.addHuman(name, age);
    // }
    
    

    }

