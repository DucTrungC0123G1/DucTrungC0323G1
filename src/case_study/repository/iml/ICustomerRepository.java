package case_study.repository.iml;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();

    void addCustomer(Customer customer);

    Customer getById(String id);

    void editCustomer(String id, Customer customer);
}
