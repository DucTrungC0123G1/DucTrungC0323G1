package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    public void displayPromotionMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flagPromotion = true;
        do {
            System.out.println("----PROMOTION MENU----\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    flagPromotion = false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagPromotion = true;
                    break;
            }
        }while (flagPromotion);

    }
}
