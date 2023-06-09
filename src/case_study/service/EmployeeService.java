package case_study.service;

import case_study.model.person.Employee;
import case_study.repository.EmployeeRepository;
import case_study.service.iml.IEmployeeService;
import case_study.ultils.ValidateRegex;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayEmployee() {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    //String name, String dateOfBirth, double identityCarNumber, double telephone, String email,
//                    String idEmployee, String levelEmployee, String position, double salary
    @Override
    public void addEmployee() {
        employeeRepository.getAll();

//        System.out.print("Enter Name Employee: ");
        String nameEmployee = ValidateRegex.checkName();

//        System.out.print("Enter DateOfBirth Employee: ");
        String dateOfBirthEmployee = ValidateRegex.checkBirthday();

//        System.out.print("Enter IdentityCardNumber Employee: ");
        String identityCardEmployee = ValidateRegex.checkIdentityCard();
        Double identityCard1 = Double.parseDouble(identityCardEmployee);

//        System.out.print("Enter Telephone Employee: ");
        String telephoneEmployee = ValidateRegex.checkPhoneNumber();
        Double telephone1 = Double.parseDouble(telephoneEmployee);

//        System.out.print("Enter Email Employee: ");
        String EmailEmployee = ValidateRegex.checkEmail();

//        System.out.print("Enter IdEmployee: ");
        String idEmployee = ValidateRegex.checkIdEmployee();
        boolean flagLevel = true;
        String level = "";
        do {
            System.out.print("Enter Level Employee: \n" +
                    "1.Vocational\n" +
                    "2.College\n" +
                    "3.University\n" +
                    "4.After University\n");
            String choiceLevel = sc.nextLine();
            switch (choiceLevel) {
                case "1":
                    level = "Vocational";
                    flagLevel = false;
                    break;
                case "2":
                    level = "College";
                    flagLevel = false;
                    break;
                case "3":
                    level = "University";
                    flagLevel = false;
                    break;
                case "4":
                    level = "After University";
                    flagLevel = false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagLevel = true;
                    break;
            }
        } while (flagLevel);

        boolean flagPosition = true;
        String position = "";
        do {
            System.out.print("Enter Position Employee: \n" +
                    "1.Reception.\n" +
                    "2.Staff.\n" +
                    "3.Expert.\n" +
                    "4.Super Vision.\n" +
                    "5.Manager.\n" +
                    "6.Director\n");
            String choicePosition = sc.nextLine();
            switch (choicePosition) {
                case "1":
                    position = "Reception";
                    flagPosition = false;
                    break;
                case "2":
                    position = "Staff";
                    flagPosition = false;
                    break;
                case "3":
                    position = "Expert";
                    flagPosition = false;
                    break;
                case "4":
                    position = "Super Vision";
                    flagPosition = false;
                    break;
                case "5":
                    position = "Manager";
                    flagPosition = false;
                    break;
                case "6":
                    position = "Direction";
                    flagPosition = false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagPosition = true;
                    break;
            }
        } while (flagPosition);

        System.out.print("Enter Salary Employee: ");
        String salaryEmployee = ValidateRegex.checkSalary();
        Double salary1 = Double.parseDouble(salaryEmployee);
        Employee employee = new Employee(nameEmployee, dateOfBirthEmployee, identityCard1,
                telephone1, EmailEmployee, idEmployee, level, position, salary1);
        employeeRepository.addNewEmployee(employee);
        System.out.println("ADD EMPLOYEE SUCCESS");
    }

    @Override
    public void editEmployee() {
        displayEmployee();
        System.out.println("Enter ID EMPLOYEE TO EDIT");
        String idEdit = ValidateRegex.checkIdEmployee();
        Employee employee = employeeRepository.getById(idEdit);
        if (employee != null) {
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
                        System.out.print("Edit Name: ");
                        String name = sc.nextLine();
                        employee.setName(ValidateRegex.checkName());
                        break;
                    case "2":
                        System.out.print("Edit DateOfBirth: ");
                        employee.setDateOfBirth(ValidateRegex.checkBirthday());
                        break;
                    case "3":
                        System.out.print("Edit IdentityCardNumber: ");
                        employee.setIdentityCarNumber(Double.parseDouble(ValidateRegex.checkIdentityCard()));
                        break;
                    case "4":
                        System.out.print("Edit Telephone: ");
                        employee.setTelephone(Double.parseDouble(ValidateRegex.checkPhoneNumber()));
                        break;
                    case "5":
                        System.out.print("Edit Email: ");
                        employee.setEmail(ValidateRegex.checkEmail());
                        break;
                    case "6":
                        System.out.print("Edit IdEmployee: ");
                        employee.setIdEmployee(ValidateRegex.checkIdEmployee());
                        break;
                    case "7":
                        System.out.print("Edit Employee Level: ");
                        boolean flagEditLv = true;
                        do {
                            System.out.println("Choice Edit Level: \n" +
                                    "1.Vocational\n" +
                                    "2.College\n" +
                                    "3.University\n" +
                                    "4.After University\n" +
                                    "0.Return Menu\n");
                            String choiceEditLv = sc.nextLine();
                            switch (choiceEditLv) {
                                case "1":
                                    employee.setLevelEmployee("Vocational");
                                    flagEditLv = false;
                                    break;
                                case "2":
                                    employee.setLevelEmployee("College");
                                    flagEditLv = false;
                                    break;
                                case "3":
                                    employee.setLevelEmployee("University");
                                    flagEditLv = false;
                                    break;
                                case "4":
                                    employee.setLevelEmployee("After University");
                                    flagEditLv = false;
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
                        System.out.print("Edit Employee Position: ");
                        boolean flagEditPosition = true;
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
                            switch (choiceEditPosition) {
                                case "1":
                                    employee.setPosition("Reception");
                                    flagEditPosition = false;
                                    break;
                                case "2":
                                    employee.setPosition("Staff");
                                    flagEditPosition = false;
                                    break;
                                case "3":
                                    employee.setPosition("Expert");
                                    flagEditPosition = false;
                                    break;
                                case "4":
                                    employee.setPosition("Super Vision");
                                    flagEditPosition = false;
                                    break;
                                case "5":
                                    employee.setPosition("Manager");
                                    flagEditPosition = false;
                                    break;
                                case "6":
                                    employee.setPosition("Director");
                                    flagEditPosition = false;
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
                        System.out.print("Edit Salary: ");
                        employee.setSalary(Double.parseDouble(ValidateRegex.checkSalary()));
                        break;
                    case "0":
                        flagEdit = false;
                        break;
                    default:
                        System.out.println("Choice Again");
                        flagEdit = true;
                        break;
                }
            } while (flagEdit);
        } else {
            System.out.println("ID Not Found");
        }
        employeeRepository.editEmployee(idEdit, employee);

    }

    @Override
    public void searchEmployee() {
        System.out.println("Enter Name Employee To Search");
        String nameSearch = sc.nextLine();
        employeeRepository.nameSearch(nameSearch);

    }

    @Override
    public void deleteEmployee() {
        employeeRepository.getAll();
        displayEmployee();
        System.out.println("Enter ID To Delete");
        String idDel = sc.nextLine();
        Employee employee = employeeRepository.getById(idDel);
        if (employee != null) {
            System.out.println("You Want Delete: " + employee + "--" + employee.getName());
            System.out.println("1.Yes\n" +
                    "2.No");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                employeeRepository.removeEmployee(employee);
                System.out.println("Delete Success");
            }
        } else {
            System.out.println("ID Not Found");
        }
    }
}

