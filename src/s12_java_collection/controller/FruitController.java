package s12_java_collection.controller;

import s12_java_collection.service.IServiceFruit;
import s12_java_collection.service.ServiceFruit;

import java.util.Scanner;

public class FruitController {
    private Scanner sc = new Scanner(System.in);
    private IServiceFruit serviceFruit = new ServiceFruit();
    public void showMenuFruit(){
        boolean flag = true;
        do {
            System.out.println("MenuFruit\n" +
                    "1.DisplayFruit\n" +
                    "2.Add Fruit\n" +
                    "3.Edit.\n" +
                    "4.Delete.\n" +
                    "0.Exit.");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    System.out.print("Display Fruit From: \n" +
                            "1. Keyset()\n" +
                            "2. Entryset()\n");
                    String choiceDisplay = sc.nextLine();
                    switch (choiceDisplay){
                        case "1":
                            serviceFruit.displayFruit();
                            break;
                        case "2":
                            serviceFruit.displayFruitEntry();
                            break;
                    }
                    break;
                case "2":
                    serviceFruit.addFruit();
                    break;
                case "3":
                    serviceFruit.editFruit();
                    break;
                case "4":
                    serviceFruit.deleteFruit();
                    break;
                case "0":
                    System.out.println("Exit Menu");
                    System.exit(1);
                    break;
                default:
                    flag = true;
                    System.out.println("Choice Again");
                    break;
            }
        }while (flag);

    }
}
