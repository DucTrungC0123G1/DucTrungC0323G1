package case_study.service;

import case_study.model.person.Employee;
import case_study.repository.EmployeeRepository;
import case_study.ultils.WriteAndReadFileEmployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    Scanner sc = new Scanner(System.in);
    EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void displayEmployee() {
        List<Employee>employeeList = employeeRepository.getAll();
        for (Employee employee :employeeList) {
            System.out.println(employee);
        }
    }
//String name, String dateOfBirth, double identityCarNumber, double telephone, String email,
//                    String idEmployee, String levelEmployee, String position, double salary
    @Override
    public void addEmployee() {
        employeeRepository.getAll();
        System.out.print("Enter Name Employee: ");
        String nameEmployee = sc.nextLine();
        System.out.print("Enter DateOfBirth Employee: ");
        String dateOfBirthEmployee = sc.nextLine();
        System.out.print("Enter IdentityCardNumber Employee: ");
        Double identityCardEmployee = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Telephone Employee: ");
        Double telephoneEmployee = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Email Employee: ");
        String EmailEmployee = sc.nextLine();
        System.out.print("Enter IdEmployee: ");
        String idEmployee = sc.nextLine();
        System.out.print("Enter Level Employee: \n" +
                "1.Vocational\n" +
                "2.College\n" +
                "3.University\n" +
                "4.After University\n");
        String choiceLevel = sc.nextLine();
        String level = "";
        boolean flagLevel = false;
        do {
            switch (choiceLevel){
                case "1":
                    level = "Vocational";
                    break;
                case "2":
                    level = "College";
                    break;
                case "3":
                    level = "University";
                    break;
                case "4":
                    level = "After University";
                    break;
                default:
                    System.out.println("Choice Again");
                    flagLevel = true;
                    break;
            }
        }while (flagLevel);

        System.out.print("Enter Position Employee: \n" +
                "1.Reception.\n" +
                "2.Staff.\n" +
                "3.Expert.\n" +
                "4.Super Vision.\n" +
                "5.Manager.\n" +
                "6.Director\n");
        String choicePosition = sc.nextLine();
        boolean flagPosition = false;
        String position = "";
        do {
            switch (choicePosition){
                case "1":
                    position = "Reception";
                    break;
                case "2":
                    position = "Staff";
                    break;
                case "3":
                    position = "Expert";
                    break;
                case "4":
                    position = "Super Vision";
                    break;
                case "5":
                    position = "Manager";
                    break;
                case "6":
                    position = "Direction";
                    break;
                default:
                    System.out.println("Choice Again");
                    flagPosition = true;
                    break;
            }
        }while (flagPosition);

        System.out.print("Enter Salary Employee: ");
        Double salaryEmployee = Double.parseDouble(sc.nextLine());
        Employee employee = new Employee(nameEmployee,dateOfBirthEmployee,identityCardEmployee,
                telephoneEmployee,EmailEmployee,idEmployee,level,position,salaryEmployee);
        employeeRepository.addNewEmployee(employee);
        System.out.println("ADD EMPLOYEE SUCCESS");
    }

    @Override
    public void editEmployee() {
        displayEmployee();
        System.out.println("Enter ID EMPLOYEE TO EDIT");
        String idEdit = sc.nextLine();
        Employee employee = employeeRepository.getById(idEdit);
        if (employee!=null){
            boolean flagEdit = false;
            do {
                System.out.println("Enter Function To Edit\n" +
                        "1. Name\n" +
                        "2. DateOfBirth\n" +
                        "3. IdentityCard\n" +
                        "4. Telephone\n" +
                        "5. Email\n" +
                        "6. ID Employee\n" +
                        "7. Level Employee\n" +
                        "8. Position Employee\n" +
                        "9. Salary\n" +
                        "0. Return Menu\n");
                String choiceEdit = sc.nextLine();
                switch (choiceEdit) {
                    case "1":
                        employee.setName(sc.nextLine());
                        break;
                    case "2":
                        employee.setDateOfBirth(sc.nextLine());
                        break;
                    case "3":
                       employee.setIdentityCarNumber(Double.parseDouble(sc.nextLine()));
                        break;
                    case "4":
                        employee.setTelephone(Double.parseDouble(sc.nextLine()));
                        break;
                    case "5":
                        String editEmail = sc.nextLine();
                        break;
                    case "6":
                        String editIDEmployee = sc.nextLine();
                        break;
                    case "7":
                        boolean flagEditLv = false;
                        do {
                            System.out.println("Choice Edit Level: \n" +
                                    "1.Vocational\n" +
                                    "2.College\n" +
                                    "3.University\n" +
                                    "4.After University\n" +
                                    "0.Return Menu\n");
                            String choiceEditLv = sc.nextLine();
                            String editLevel = "";
                            switch (choiceEditLv) {
                                case "1":
                                    editLevel = "Vocational";
                                    break;
                                case "2":
                                    editLevel = "College";
                                    break;
                                case "3":
                                    editLevel = "University";
                                    break;
                                case "4":
                                    editLevel = "After University";
                                    break;
                                case "0":
                                    flagEditLv = false;
                                    break;
                                default:
                                    System.out.println("Choice Again");
                                    flagEditLv = true;
                                    break;
                            }
                        } while (flagEditLv);
                        break;
                    case "8":
                        boolean flagEditPosition = false;
                        do {
                            System.out.println("Choice Edit Position\n" +
                                    "1.Reception.\n" +
                                    "2.Staff.\n" +
                                    "3.Expert.\n" +
                                    "4.Super Vision.\n" +
                                    "5.Manager.\n" +
                                    "6.Director\n" +
                                    "0.Return Menu\n");
                            String choiceEditPosition = sc.nextLine();
                            String editPosition = "";
                            switch (choiceEditPosition) {
                                case "1":
                                    editPosition = "Reception";
                                    break;
                                case "2":
                                    editPosition = "Staff";
                                    break;
                                case "3":
                                    editPosition = "Expert";
                                    break;
                                case "4":
                                    editEmail = "Super Vision";
                                    break;
                                case "5":
                                    editEmail = "Manager";
                                    break;
                                case "6":
                                    editEmail = "Director";
                                    break;
                                case "0":
                                    flagEditPosition = false;
                                    break;
                                default:
                                    System.out.println("Choice Again");
                                    flagEditPosition = true;
                                    break;
                            }
                        } while (flagEditPosition);
                        break;
                    case "9":
                        Double editSalary = Double.parseDouble(sc.nextLine());
                        break;
                    case "0":
                        flagEdit = true;
                        break;
                    default:
                        System.out.println("Choice Again");
                        flagEdit = true;
                        break;
                }
            }while (flagEdit);
        }employeeRepository.editEmployee(employee,idEdit);


    }
}
