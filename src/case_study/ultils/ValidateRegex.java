package case_study.ultils;

import java.util.regex.Pattern;

public class ValidateRegex {
    private static final String REGEX_NAME = "^[A-Z][a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
    private static final String REGEX_TELEPHONE = "^0\\d{9}$";
    private static final String REGEX_EMAIL="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    static public boolean checkName(String employeeName) {
        return employeeName.matches(REGEX_NAME) ? true : false;
    }
    private static final String REGEX_EMPLOYEE_AGE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";


}

