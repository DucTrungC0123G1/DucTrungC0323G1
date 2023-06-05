package case_study.ultils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateRegex {

    private static final String REGEX_NAME = "^[A-Z][a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";

    static public String checkName() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String name = null;
        while (flag) {
            System.out.println("Enter Name:");
            name = sc.nextLine();
            if (name.matches(REGEX_NAME)) {
                flag = false;
            }
        }
        return name;
    }

    private static final String REGEX_TELEPHONE = "^0\\d{9}$";

    public static String checkPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String phoneNumber = null;
        while (flag) {
            System.out.print("Enter phoneNumber: ");
            phoneNumber = sc.nextLine();
            if (phoneNumber.matches(REGEX_TELEPHONE)) {
                flag = false;
            }
        }
        return phoneNumber;
    }

    private static final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    static public String checkEmail() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String email = null;
        while (flag) {
            System.out.println("Enter Email");
            email = sc.nextLine();
            if (email.matches(REGEX_EMAIL)) {
                flag = false;
            }
        }
        return email;
    }

    private static final String REGEX_AGE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    static public String checkBirthday() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String birthday = null;
        while (flag) {
            System.out.println("Enter Birthday: ");
            birthday = sc.nextLine();
            if (birthday.matches(REGEX_AGE)) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dateOfBirth = LocalDate.parse(birthday, formatter);
                LocalDate currentDate = LocalDate.now();
                int age = Period.between(dateOfBirth, currentDate).getYears();
                if (age >= 18) {
                    flag = false;
                    break;
                } else {
                    System.out.println("Under 18 age.");
                }
            } else {
                System.out.println("Not Match Format");
            }
        }
        return birthday;
    }

    private static final String REGEX_IDENTITYCARD = "^[0-9]{9}|[0-9]{12}$";

    static public String checkIdentityCard() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String identityCard = null;
        while (flag) {
            System.out.print("Enter identityCard: ");
            identityCard = sc.nextLine();
            if (identityCard.matches(REGEX_IDENTITYCARD)) {
                flag = false;
            }
        }
        return identityCard;
    }

    private static final String REGEX_ID_EMPLOYEE = "^NV-[0-9]{4}$";

    static public String checkIdEmployee() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String idEmployee = null;
        while (flag) {
            System.out.println("Enter IdEmployee: ");
            idEmployee = sc.nextLine();
            if (idEmployee.matches(REGEX_ID_EMPLOYEE)) {
                flag = false;
            }
        }
        return idEmployee;
    }

    private static final String REGEX_SALARY = "^[1-9]+$";
    static public String checkSalary(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String salary = null;
        while (flag){
            System.out.println("Enter Salary: ");
            salary = sc.nextLine();
            if (salary.matches(REGEX_SALARY)){
                flag = false;
            }
        }
        return salary;
    }
    private static final String REGEX_ID_CUSTOMER = "^KH-[0-9]{4}$";

    static public String checkIdCustomer() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String idCustomer = null;
        while (flag) {
            System.out.println("Enter ID Customer: ");
            idCustomer = sc.nextLine();
            if (idCustomer.matches(REGEX_ID_CUSTOMER)) {
                flag = false;
            }
        }
        return idCustomer;
    }
}

