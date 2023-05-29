package case_study.controller;

import case_study.service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public void displayEmployeeMenu(){
        EmployeeService employeeService = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        boolean flagEmployee = true;
        do {
            System.out.println("----EmployeeMenu----\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
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
                    flagEmployee = false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagEmployee = true;
                    break;
            }
        }while (flagEmployee);

    }
}
