package case_study.model.person;

public class Customer extends Person{
    String idCustomer;
    String typeCustomer;
    String address;

    public Customer(String name, String dateOfBirth, double identityCarNumber, double telephone, String email,
                    String idCustomer, String typeCustomer, String address) {
        super(name, dateOfBirth, identityCarNumber, telephone, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identityCarNumber=" + identityCarNumber +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }
}
