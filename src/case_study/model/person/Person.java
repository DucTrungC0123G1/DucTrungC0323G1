package case_study.model.person;

public abstract class Person {
    String name;
    String dateOfBirth;
    double identityCarNumber;
    double telephone;
    String email;

    public Person() {
    }

    public Person(String name, String dateOfBirth, double identityCarNumber, double telephone, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.identityCarNumber = identityCarNumber;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getIdentityCarNumber() {
        return identityCarNumber;
    }

    public void setIdentityCarNumber(double identityCarNumber) {
        this.identityCarNumber = identityCarNumber;
    }

    public double getTelephone() {
        return telephone;
    }

    public void setTelephone(double telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identityCarNumber=" + identityCarNumber +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }
}
