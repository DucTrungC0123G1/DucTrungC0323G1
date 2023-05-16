package s8_cleancode_refactoring;

public class EmployeeDetails {
    private String name;
    private String age;
    private String awards;
    private String ctc;
    private String experience;

    public EmployeeDetails() {
    }

    public EmployeeDetails(String name, String age, String awards, String ctc, String experience) {
        this.name = name;
        this.age = age;
        this.awards = awards;
        this.ctc = ctc;
        this.experience = experience;
    }
}
