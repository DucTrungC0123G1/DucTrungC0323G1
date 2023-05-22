package s12_java_collection.service;

import s12_java_collection.model.Fruit;
import s12_java_collection.repository.RepositoryFruit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ServiceFruit implements IServiceFruit {
    private Scanner sc = new Scanner(System.in);
    private RepositoryFruit repositoryFruit = new RepositoryFruit();

    @Override
    public void displayFruit() {
        Map<String, Fruit> fruitMap = repositoryFruit.getFruit();
        for (String s : fruitMap.keySet()) {
            System.out.println(s + ":" + fruitMap.get(s));
        }

    }

    @Override
    public void displayFruitEntry() {
        Set<Map.Entry<String, Fruit>> entrySet = repositoryFruit.getFruit().entrySet();
        for (Map.Entry<String, Fruit> m : entrySet) {
            System.out.println(m.getKey() + "--" + m.getValue());
        }
    }

    @Override
    public void deleteFruit() {
        displayFruitEntry();
        System.out.println("Enter ID To Delete");
        String idDel = sc.nextLine();
        Fruit fruit = repositoryFruit.getById(idDel);
        if (fruit == null) {
            System.out.println("ID Not Found");
        } else {
            System.out.println("Do you want delete Fruit: " + fruit.getNameFruit());
            System.out.println("1. Delete.\n" +
                    "2.Cancel.");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                repositoryFruit.removeFruit(fruit);
                System.out.println("Delete success");
            }
        }

    }

    //String nameFruit, String typeFruit, String dateOfManu, String expDate, String origin, String price,
//                 String idFruit
    @Override
    public void addFruit() {
        System.out.print("Enter NameFruit: ");
        String newName = sc.nextLine();
        System.out.print("Enter typeFruit: ");
        String newTypeFruit = sc.nextLine();
        System.out.print("Enter dateOfManu: ");
        String newDateOfManu = sc.nextLine();
        System.out.print("Enter expDate: ");
        String newExpDate = sc.nextLine();
        System.out.print("Enter origin: ");
        String newOrigin = sc.nextLine();
        System.out.print("Enter Price: ");
        String newPrice = sc.nextLine();
        System.out.print("Enter idFruit: ");
        String newIDFruit = sc.nextLine();
        Fruit fruit = new Fruit(newName, newTypeFruit, newDateOfManu, newExpDate, newOrigin, newPrice, newIDFruit);
        repositoryFruit.addNewFruit(fruit);
    }

    @Override
    public void editFruit() {
        displayFruit();
        System.out.println("Enter ID To Edit");
        String id = sc.nextLine();
        Fruit fruit = repositoryFruit.getFruit().get(id);
        boolean flag = true;
        do {
            if (fruit != null) {
                System.out.print("--Choose Menu To Edit--\n" +
                        "1. Edit Name\n" +
                        "2. Edit Type\n" +
                        "3. Edit DateOfManu\n" +
                        "4. Edit ExpDate\n" +
                        "5. Edit Origin\n" +
                        "6. Edit Price\n" +
                        "7. Edit ID.\n" +
                        "0. Exit.\n");
                String choiceEdit = sc.nextLine();
                switch (choiceEdit) {
                    case "1":
                        System.out.print("Edit Name: ");
                        fruit.setNameFruit(sc.nextLine());
                        break;
                    case "2":
                        System.out.print("Edit Type: ");
                        fruit.setTypeFruit(sc.nextLine());
                        break;
                    case "3":
                        System.out.print("Edit DateOfManu: ");
                        fruit.setDateOfManu(sc.nextLine());
                        break;
                    case "4":
                        System.out.print("Edit ExpDate: ");
                        fruit.setExpDate(sc.nextLine());
                        break;
                    case "5":
                        System.out.print("Edit Origin: ");
                        fruit.setOrigin(sc.nextLine());
                        break;
                    case "6":
                        System.out.print("Edit Price: ");
                        fruit.setPrice(sc.next());
                        break;
                    case "7":
                        System.out.print("Edit ID: ");
                        fruit.setIdFruit(sc.nextLine());
                        break;
                    case "0":
                        System.out.print("Exit Edit");
                        flag = false;
                        break;
                    default:
                        System.out.println("Choice Again");
                        flag = true;
                        break;
                }
            }
            repositoryFruit.editFruit(id);
        } while (flag);
    }
}
