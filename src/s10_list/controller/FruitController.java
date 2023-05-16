package s10_list.controller;

import s10_list.service.ServiceFruit;

import java.util.Scanner;

public class FruitController {
    Scanner sc = new Scanner(System.in);
    ServiceFruit serviceFruit = new ServiceFruit();
    public void showMenuFruit(){
        boolean flag = true;
        do {
            System.out.println("MenuFruit\n" +
                    "1.DisplayFruit\n" +
                    "2.Add Fruit\n" +
                    "3.Exit.");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    serviceFruit.displayFruit();
                    break;
                case "2":
                    serviceFruit.addNewFruit();
                    break;
                case "3":
                    System.out.println("Exit Menu");
                    flag = false;
                    break;
                default:
                    flag = true;
                    System.out.println("Choice Again");
                    break;
            }
        }while (flag);

    }
}
