package case_study.service;

import case_study.model.person.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.iml.ICustomerRepository;
import case_study.service.iml.ICustomerService;
import case_study.ultils.ValidateRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayCustomer() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    //String name, String dateOfBirth, double identityCarNumber, double telephone, String email,
//                    String idCustomer, String typeCustomer, String address)
    @Override
    public void addCustomer() {
        customerRepository.getAll();
        System.out.print("Enter Name Customer: ");
        String nameCustomer = ValidateRegex.checkName();
        System.out.print("Enter DateOfBirth Customer: ");
        String dateCustomer = ValidateRegex.checkBirthday();
        System.out.print("Enter IndentityCardNumber: ");
        Double identityCardNumber = Double.parseDouble(ValidateRegex.checkIdentityCard());
        System.out.print("Enter Telephone Customer: ");
        Double telephoneCustomer = Double.parseDouble(ValidateRegex.checkPhoneNumber());
        System.out.print("Enter Email Customer: ");
        String emailCustomer = ValidateRegex.checkEmail();
        System.out.print("Enter ID Customer: ");
        String idCustomer = ValidateRegex.checkIdCustomer();
        boolean flagType = true;
        String typeCustomer = "";
        do {
            System.out.print("Enter Type Customer: \n" +
                    "1.Diamond\n" +
                    "2.Platinum\n" +
                    "3.Gold\n" +
                    "4.Silver\n" +
                    "5.Member\n");
            String choiceType = sc.nextLine();
            switch (choiceType) {
                case "1":
                    typeCustomer = "Diamond";
                    flagType = false;
                    break;
                case "2":
                    typeCustomer = "Platinum";
                    flagType = false;
                    break;
                case "3":
                    typeCustomer = "Gold";
                    flagType = false;
                    break;
                case "4":
                    typeCustomer = "Silver";
                    flagType = false;
                    break;
                case "5":
                    typeCustomer = "Member";
                    flagType = false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagType = true;
                    break;
            }

        } while (flagType);
        System.out.print("Enter Address Customer: ");
        String addressCustomer = sc.nextLine();
        Customer customer = new Customer(nameCustomer, dateCustomer, identityCardNumber, telephoneCustomer, emailCustomer,
                idCustomer, typeCustomer, addressCustomer);
        customerRepository.addCustomer(customer);
        System.out.println("Add New Success");

    }

    @Override
    public void editCustomer() {
        displayCustomer();
        System.out.print("Enter ID Customer To Edit: ");
        String idEditCustomer = ValidateRegex.checkIdCustomer();
        Customer customer = customerRepository.getById(idEditCustomer);
        if (customer != null) {
            boolean flagEdit = false;
            do {
                System.out.println("Enter Function To Edit\n" +
                        "1. Name\n" +
                        "2. DateOfBirth\n" +
                        "3. IdentityCard\n" +
                        "4. Telephone\n" +
                        "5. Email\n" +
                        "6. Type Customer\n" +
                        "7. Address\n" +
                        "0. Return Menu\n");
                String choiceEdit = sc.nextLine();
                switch (choiceEdit) {
                    case "1":
                        System.out.print("Edit Name: ");
                        customer.setName(ValidateRegex.checkName());
                        break;
                    case "2":
                        System.out.print("Edit DateOfBirth: ");
                        customer.setDateOfBirth(ValidateRegex.checkBirthday());
                        break;
                    case "3":
                        System.out.print("Edit IdentityCard: ");
                        customer.setIdentityCarNumber(Double.parseDouble(ValidateRegex.checkIdentityCard()));
                        break;
                    case "4":
                        System.out.print("Edit Telephone: ");
                        customer.setTelephone(Double.parseDouble(ValidateRegex.checkPhoneNumber()));
                        break;
                    case "5":
                        System.out.print("Edit Email: ");
                        customer.setEmail(ValidateRegex.checkEmail());
                        break;
                    case "6":
                        boolean flagType = true;
                        do {
                            System.out.println("Edit Type Customer: \n" +
                                    "1.Diamond\n" +
                                    "2.Platinum\n" +
                                    "3.Gold\n" +
                                    "4.Silver\n" +
                                    "5.Member\n" +
                                    "0.Return");
                            String choiceType = sc.nextLine();
                            switch (choiceType) {
                                case "1":
                                    customer.setTypeCustomer("Diamond");
                                    flagType = false;
                                    break;
                                case "2":
                                    customer.setTypeCustomer("Platinum");
                                    flagType = false;
                                    break;
                                case "3":
                                    customer.setTypeCustomer("Gold");
                                    flagType = false;
                                    break;
                                case "4":
                                    customer.setTypeCustomer("Silver");
                                    flagType = false;
                                    break;
                                case "5":
                                    customer.setTypeCustomer("Member");
                                    flagType = false;
                                    break;
                                case "0":
                                    flagType = false;
                                    break;
                                default:
                                    System.out.println("Choice Again");
                                    flagType = true;
                                    break;
                            }
                        } while (flagType);
                        break;
                    case "7":
                        System.out.print("Edit Address");
                        customer.setAddress(sc.nextLine());
                        break;
                    case "0":
                        break;
                    default:
                        System.out.println("Choice Again");
                        flagEdit = true;
                        break;
                }
            } while (flagEdit);
        } else {
            System.err.println("ID Not Found");
        }
        customerRepository.editCustomer(idEditCustomer, customer);
    }

    @Override
    public void deleteCustomer() {
        displayCustomer();
        System.out.println("Enter ID Customer To Delete");
        String idDel = sc.nextLine();
        Customer customer = customerRepository.getById(idDel);
        if (customer != null) {
            System.out.println("Do You Want Delete: " + customer + "--" + customer.getName());
            System.out.println("1.Yes\n" +
                    "2.No");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                customerRepository.removeCustomer(customer);
                System.out.println("Delete Success");
            }
        } else {
            System.out.println("ID Not Found");
        }
    }

    @Override
    public void searchCustomer() {
        while (true) {
            System.out.println("Enter Customer Name");
            String nameSearch = sc.nextLine();
            List<Customer> customerList = customerRepository.getByName(nameSearch);
            if (customerList == null) {
                System.out.println("Name Not Found");
            } else {
                for (Customer c : customerList) {
                    System.out.println(c);
                }
                break;
            }
        }
    }
}
