package case_study.service;

import case_study.model.person.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.iml.ICustomerRepository;
import case_study.service.iml.ICustomerService;

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
        String nameCustomer = sc.nextLine();
        System.out.print("Enter DateOfBirth Customer: ");
        String dateCustomer = sc.nextLine();
        System.out.print("Enter IndentityCardNumber: ");
        Double identityCardNumber = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Telephone Customer: ");
        Double telephoneCustomer = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Email Customer: ");
        String emailCustomer = sc.nextLine();
        System.out.print("Enter ID Customer: ");
        String idCustomer = sc.nextLine();
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
                    flagType= false;
                    break;
                case "2":
                    typeCustomer = "Platinum";
                    flagType= false;
                    break;
                case "3":
                    typeCustomer = "Gold";
                    flagType= false;
                    break;
                case "4":
                    typeCustomer = "Silver";
                    flagType= false;
                    break;
                case "5":
                    typeCustomer = "Member";
                    flagType= false;
                    break;
                default:
                    System.out.println("Choice Again");
                    flagType = true;
                    break;
            }

        }while (flagType);
        System.out.print("Enter Address Customer: ");
        String addressCustomer = sc.nextLine();
        Customer customer = new Customer(nameCustomer,dateCustomer,identityCardNumber,telephoneCustomer,emailCustomer,
                idCustomer,typeCustomer,addressCustomer);
        customerRepository.addCustomer(customer);
        System.out.println("Add New Success");

    }

    @Override
    public void editCustomer() {
        displayCustomer();
        System.out.print("Enter ID Customer To Edit: ");
        String idEditCustomer = sc.nextLine();
        Customer customer = customerRepository.getById(idEditCustomer);
        if (customer!=null){
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
                String choiceEdit = sc .nextLine();
                switch (choiceEdit){
                    case "1":
                        System.out.print("Edit Name: ");
                        customer.setName(sc.nextLine());
                        break;
                    case "2":
                        System.out.print("Edit DateOfBirth: ");
                       customer.setDateOfBirth(sc.nextLine());
                        break;
                    case "3":
                        System.out.print("Edit IdentityCard: ");
                        customer.setIdentityCarNumber(Double.parseDouble(sc.nextLine()));
                        break;
                    case "4":
                        System.out.print("Edit Telephone: ");
                        customer.setTelephone(Double.parseDouble(sc.nextLine()));
                        break;
                    case "5":
                        System.out.print("Edit Email: ");
                        customer.setEmail(sc.nextLine());
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
                            switch (choiceType){
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
                                    flagType=false;
                                    break;
                                default:
                                    System.out.println("Choice Again");
                                    flagType = true;
                                    break;
                            }
                        }while (flagType);
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
            }while (flagEdit);
        }else {
            System.err.println("ID Not Found");
        }
        customerRepository.editCustomer(idEditCustomer,customer);
    }
}
