package case_study.controller;

import java.util.Scanner;

public class CustomerController {
    Scanner sc = new Scanner(System.in);
    public void displayCustomerMenu(){
        boolean flagCustomer = true;
        do {
            System.out.println("----CUSTOMER MENU----\n" +
                    "1. Display list customer\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    flagCustomer = false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagCustomer = true;
                    break;
            }
        }while (flagCustomer);

    }
}
