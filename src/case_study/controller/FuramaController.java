package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        BookingController bookingController = new BookingController();
        PromotionController promotionController = new PromotionController();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----FURAMA MANAGER----\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit.");
            String choiceMenu = sc.nextLine();
            switch (choiceMenu){
                case "1":
                    employeeController.displayEmployeeMenu();
                    break;
                case "2":
                    customerController.displayCustomerMenu();
                    break;
                case "3":
                    facilityController.displayFacilityMenu();
                    break;
                case "4":
                    bookingController.displayBooking();
                    break;
                case "5":
                    promotionController.displayPromotionMenu();
                    break;
                case "6":
                    System.out.println("Exit Menu");
                    flag= false;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Choice Again");
                    flag=true;
                    break;
            }
        }while (flag);

    }
}
