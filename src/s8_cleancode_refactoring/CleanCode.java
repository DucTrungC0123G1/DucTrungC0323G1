package s8_cleancode_refactoring;

public class CleanCode {
    public int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public EmployeeDetails employeeDetails(EmployeeDetails employeeDetails) {
        return employeeDetails;
    }


    public int getDayOfMonth(int month, int year) {
        boolean flag = true;
        do {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    flag = false;
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    flag = false;
                    return 30;
                case 2:
                    flag = false;
                    return isLeapYear(year) ? 29 : 28;
                default:
                    flag = true;
                    return -1;
            }

        } while (flag);

    }

}
