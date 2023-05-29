package case_study.controller;

import java.util.Scanner;

public class BookingController {
    public void displayBooking(){
        Scanner sc = new Scanner(System.in);
        boolean flagBooking = true;
        do {
            System.out.println("----BOOKING MENU----\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n");
            String choice = sc .nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    flagBooking = false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagBooking = true;
                    break;
            }
        }while (flagBooking);

    }
}
