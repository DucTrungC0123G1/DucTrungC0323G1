package case_study.ultils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidateRegex {
    static Scanner sc = new Scanner(System.in);

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

    static public String checkSalary() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String salary = null;
        while (flag) {
            System.out.println("Enter Salary: ");
            salary = sc.nextLine();
            if (salary.matches(REGEX_SALARY)) {
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

    private static final String REGEX_ID_ROOM = "^SVRO-[0-9]{4}$";

    static public String checkIdRoom() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String idServiceRoom = null;
        while (flag) {
            System.out.println("Enter ID ServiceRoom: (SVRO-XXXX) ");
            idServiceRoom = sc.nextLine();
            if (idServiceRoom.matches(REGEX_ID_ROOM)) {
                flag = false;
            }
        }
        return idServiceRoom;
    }

    //    private static final String REGEX_AREA = "^[3-9]+[0-9]+$";
    static public float checkArea() {
        boolean flag = true;
        float area = 0;
        while (flag) {
            System.out.println("Enter Area:(>=30m2) ");
            area = Float.parseFloat(sc.nextLine());
            if (area >= 30) {
                flag = false;
            } else {
                System.err.println("Area >= 30m2");
            }
        }
        return area;
    }

    public static Float checkRental() {
        boolean flag = true;
        float rental = 0;
        while (flag) {
            System.out.println("Enter Rental: ( >0)");
            rental = Float.parseFloat(sc.nextLine());
            if (rental > 0) {
                flag = false;
            } else {
                System.err.println("Rental > 0");
            }
        }
        return rental;
    }

    public static int checkMaxPeople() {
        boolean flag = true;
        int maxPeople = 0;
        while (flag) {
            System.out.println("Enter People: (0< X < 20)");
            maxPeople = Integer.parseInt(sc.nextLine());
            if (maxPeople > 0 && maxPeople < 20) {
                flag = false;
            } else {
                System.err.println("0 < People < 20");
            }
        }
        return maxPeople;
    }

    public static String checkTypeRent() {
        boolean flag = true;
        String typeRent ="";
        do {
            System.out.println("Choice TypeRent: \n" +
                    "1. By Hour\n" +
                    "2. By Day\n" +
                    "3. By Month\n" +
                    "4. By Year\n");
            String choice =sc.nextLine();
            switch (choice){
                case "1":
                    typeRent = "By Hour";
                    flag = false;
                    break;
                case "2":
                    typeRent = "By Day";
                    flag = false;
                    break;
                case "3":
                    typeRent = "By Month";
                    flag = false;
                    break;
                case "4":
                    typeRent = "By Year";
                    flag = false;
                    break;
                default:
                    System.err.println("Choice Again");
                    flag = true;

            }
        }while (flag);
        return typeRent;
    }

    private static final String REGEX_ID_HOUSE = "^SVHO-[0-9]{4}$";

    static public String checkIdHouse() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String idServiceHouse = null;
        while (flag) {
            System.out.println("Enter ID ServiceHouse: (SVHO-XXXX) ");
            idServiceHouse = sc.nextLine();
            if (idServiceHouse.matches(REGEX_ID_HOUSE)) {
                flag = false;
            }
        }
        return idServiceHouse;
    }
    private static final String REGEX_FLOOR = "^[1-9]$";
    public static String checkFloor() {
        boolean flag = true;
        String floors = null;
        while (flag){
            System.out.println("Enter Floor: ");
            floors = (sc.nextLine());
            if (floors.matches(REGEX_FLOOR)){
                flag = false;
            }
        }
        return floors;
    }
    private static final String REGEX_ID_VILLA = "^SVVL-[0-9]{4}$";
    public static String checkIdVilla() {
        boolean flag= true;
        String idVilla = null;
        while (flag){
            System.out.println("Enter ID ServiceVilla");
            idVilla = sc.nextLine();
            if (idVilla.matches(REGEX_ID_VILLA)){
                flag =false;
            }
        }
        return idVilla;
    }
}

