package case_study.model.person;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return idCustomer.equals(customer.idCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCustomer);
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
