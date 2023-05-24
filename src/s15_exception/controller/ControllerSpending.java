package s15_exception.controller;

import s15_exception.service.IServiceSpending;
import s15_exception.service.ServiceSpending;

import java.util.Scanner;

public class ControllerSpending {
    private IServiceSpending serviceSpending = new ServiceSpending();
    private Scanner sc = new Scanner(System.in);

    public void showMenuSpend() {
        boolean flag = true;
        do {

            System.out.println("--Menu--\n" +
                    "1. Display\n" +
                    "2. Add\n" +
                    "3. Delete\n" +
                    "4. Edit\n" +
                    "5. Search by Id\n" +
                    "6. Search by Name\n" +
                    "7. Sort by Name\n" +
                    "8. Sort by Money\n" +
                    "0. Exit");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    serviceSpending.display();
                    break;
                case "2":
                    serviceSpending.addSpend();
                    break;
                case "3":
                    serviceSpending.delSpend();
                    break;
                case "4":
                    serviceSpending.editSpend();
                    break;
                case "5":
                    serviceSpending.searchById();
                    break;
                case "6":
                    serviceSpending.searchByName();
                    break;
                case "7":
                    serviceSpending.sortName();
                    break;
                case "8":
                    serviceSpending.sortMoney();
                    break;
                case "0":
                    System.out.println("Exit Menu");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Choice Again");
                    flag = true;
                    break;
            }
        } while (flag);
    }
}
