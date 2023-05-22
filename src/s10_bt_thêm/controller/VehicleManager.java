package s10_bt_thêm.controller;

import s10_bt_thêm.service.*;

import java.util.Scanner;

public class VehicleManager {
    private static ICarService carService = new CarService();
    private static ITruckService truckService = new TruckService();
    private static IMotorBikeService motorBikeService = new MotorBikeService();
    public static void showMenuVehicle(){

        boolean flag = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("---Menu Vehicle---\n" +
                    "1. Add New Vehicle.\n" +
                    "2. Display Vehicle.\n" +
                    "3. Delete Vehicle.\n" +
                    "4. Search Vehicle By License.\n" +
                    "5. Exit.\n" +
                    "Enter Your Choice.");
            String choice = sc.nextLine();

            switch (choice){
                case "1":
                    boolean flagAdd = true;
                    do {
                        System.out.println("Choice Vehicle To Add.\n" +
                                "1. Car.\n" +
                                "2. MotorBike.\n" +
                                "3. Truck.\n" +
                                "4. Return Menu.");
                        String choiceAdd = sc.nextLine();
                        switch (choiceAdd){
                            case "1":
                                carService.addNewCar();
                                break;
                            case "2":
                                motorBikeService.addNewMotorBike();
                                break;
                            case "3":
                                truckService.addNewTruck();
                                break;
                            case "4":
                                System.out.println("Choice Your Again");
                                flagAdd = false;
                                break;
                        }

                    }while (flagAdd);
                    break;
                case "2":
                    System.out.println("Enter Your Choice\n" +
                            "1.Display Car\n" +
                            "2.Display Truck\n" +
                            "3.Display MotorBike\n");
                    String choiceDisplay = sc.nextLine();
                    switch (choiceDisplay){
                        case "1":
                            carService.displayCar();
                            break;
                        case "2":
                            truckService.displayTruck();
                            break;
                        case "3":
                            motorBikeService.displayMotorBike();
                            break;
                    }
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    System.out.println("Exit Menu");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter Your Choice Again");
                    flag= true;
                    break;
            }
        }while (flag);


    }
}
