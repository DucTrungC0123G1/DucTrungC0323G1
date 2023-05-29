package case_study.model.person;

public class Employee extends Person{
    String idEmployee;
    String levelEmployee;
    String position;
    double salary;

    public Employee(String name, String dateOfBirth, double identityCarNumber, double telephone, String email,
                    String idEmployee, String levelEmployee, String position, double salary) {
        super(name, dateOfBirth, identityCarNumber, telephone, email);
        this.idEmployee = idEmployee;
        this.levelEmployee = levelEmployee;
        this.position = position;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", levelEmployee='" + levelEmployee + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identityCarNumber=" + identityCarNumber +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }
    public String getInfoEmployeeToCsv(){
        return super.name+","+super.dateOfBirth+","+super.identityCarNumber+","+super.telephone+","+super.email+","+
                this.idEmployee+","+this.levelEmployee+","+this.position+","+this.salary;
    }
}
