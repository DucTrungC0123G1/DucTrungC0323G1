package case_study.controller;

import case_study.service.FacilityService;
import case_study.service.iml.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    public void displayFacilityMenu(){
        IFacilityService facilityService = new FacilityService();
        Scanner sc = new Scanner(System.in);
        boolean flagFacility = true;
        do {
            System.out.println("----FACILITY MENU----\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    facilityService.displayFacility();
                    break;
                case "2":
                    facilityService.addFacility();
                    break;
                case "3":
                    break;
                case "4":
                    flagFacility=false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagFacility = true;
                    break;
            }
        }while (flagFacility);
    }
}
