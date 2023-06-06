package case_study.repository;

import case_study.model.person.Customer;
import case_study.repository.iml.ICustomerRepository;
import case_study.ultils.WriteAndRead;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();
    public static final String PATH_CUSTOMER = "D:\\CodeGym\\C0323G1_NguyenDucTrung\\Module 2\\untitled\\src\\case_study\\data\\Customer.csv";

    //String name, String dateOfBirth, double identityCarNumber, double telephone, String email,
    //                    String idCustomer, String typeCustomer, String address)
    @Override
    public List<Customer> getAll() {
        List<String> stringList = WriteAndRead.readFile(PATH_CUSTOMER);
        customerList.clear();
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            customerList.add(new Customer(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), info[4],
                    info[5], info[6], info[7]));
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getIdentityCarNumber() + ","
                + customer.getTelephone() + "," + customer.getEmail() + "," + customer.getIdCustomer() + "," +
                customer.getTypeCustomer() + "," + customer.getAddress());
        WriteAndRead.writeFile(stringList, PATH_CUSTOMER, true);
    }

    @Override
    public Customer getById(String id) {
        customerList = getAll();
        for (Customer c : customerList) {
            if (c.getIdCustomer().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        customerList = getAll();
        List<String> stringList = WriteAndRead.readFile(PATH_CUSTOMER);
        String[] temp;
        for (int i = 0; i < stringList.size(); i++) {
            temp = stringList.get(i).split(",");
            if (temp[5].equals(id)) {
                stringList.set(i, customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getIdentityCarNumber() + ","
                        + customer.getTelephone() + "," + customer.getEmail() + "," + customer.getIdCustomer() + "," +
                        customer.getTypeCustomer() + "," + customer.getAddress());
            }
        }
        WriteAndRead.writeFile(stringList, PATH_CUSTOMER, true);
    }

    @Override
    public void removeCustomer(Customer customer) {
        customerList = getAll();
        customerList.remove(customer);
        List<String> stringList = new ArrayList<>();
        for (Customer temp : customerList) {
            stringList.add(temp.getName() + "," + temp.getDateOfBirth() + "," + temp.getIdentityCarNumber() + "," + temp.getTelephone() +
                    "," + temp.getEmail() + "," + temp.getIdCustomer() + "," + temp.getTypeCustomer() + "," + temp.getAddress());
        }
        WriteAndRead.writeFile(stringList, PATH_CUSTOMER, false);
    }

    @Override
    public List<Customer> getByName(String name) {
        List<Customer> customers = new ArrayList<>();
        customerList = getAll();
        for (Customer c : customerList) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                customers.add(c);
            }
        }
        if (customers.size() == 0) {
            return null;
        }
        return customers;
    }
}
