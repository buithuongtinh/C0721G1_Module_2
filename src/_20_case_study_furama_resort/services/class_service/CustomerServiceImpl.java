package _20_case_study_furama_resort.services.class_service;

import _20_case_study_furama_resort.libs.Exception;
import _20_case_study_furama_resort.models.Customer;
import _20_case_study_furama_resort.services.CustomerService;
import _20_case_study_furama_resort.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Exception implements CustomerService {
    public static List<Customer> linkedList = new LinkedList<>();
//    public static Customer customer = new Customer();
    public static Scanner scanner = new Scanner(System.in);
    private static final String FILE_CUSTOMER = "src\\_20_case_study_furama_resort\\data\\customer.csv";

    @Override
    public void add() {
        int id ;
        if (linkedList.isEmpty()) {
            id = 1;
        } else {
            id = linkedList.get(linkedList.size() -1 ).getId() +1;
        }
        System.out.println("Enter name customer: ");
        String nameC = scanner.nextLine();
        System.out.println("Enter date of birth customer: ");
        String dateOfBirthC = scanner.nextLine();
        System.out.println("Enter gender customer: ");
        String genderC = scanner.nextLine();
        System.out.println("Enter identity number customer: ");
        String identityNumberC = scanner.nextLine();
        System.out.println("Enter phone number customer: ");
        String phoneNumberC = scanner.nextLine();
        System.out.println("Enter email customer: ");
        String emailC = scanner.nextLine();
        System.out.println("Choose typeCustomer:");
        System.out.println("1 = Diamond");
        System.out.println("2 = Platinum");
        System.out.println("3 = Gold");
        System.out.println("4 = Silver ");
        System.out.println("5 = Member");
        String typeCustomer = scanner.nextLine();
        switch (typeCustomer) {
            case "1": {
                System.out.println("Diamond");
                typeCustomer = "Diamond";
                break;
            }
            case "2": {
                System.out.println("Platinum,");
                typeCustomer = "Platinum";
                break;
            }
            case "3": {
                System.out.println("Gold");
                typeCustomer = "Gold";
                break;
            }
            case "4": {
                System.out.println("Silver");
                typeCustomer = "Silver";
                break;
            }
            case "5": {
                System.out.println("Member");
                typeCustomer = "Member";
                break;
            }
            default: {
                System.out.println("Entered wrong, please re-enter");
                break;
            }
        }

        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        linkedList.add(new Customer(id,nameC,dateOfBirthC,genderC,identityNumberC,phoneNumberC,emailC,typeCustomer,address));
        ReadAndWriteFile.writeListCustomerToCSV(linkedList,FILE_CUSTOMER,false);


    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {
        List<Customer> customerList =ReadAndWriteFile.getListCustomerFromCSV(FILE_CUSTOMER);
        System.out.println("Enter id need to edit: ");
        int idEdit = choiceNumber();
        if (customerList.isEmpty()) {
            System.out.println("Nothing to edit");
        } else {
            for (Customer customer : linkedList){
                if (idEdit == customer.getId()){
                    System.out.println("Enter new name customer: ");
                    String newName = scanner.nextLine();
                    customer.setName(newName);
                    System.out.println("Enter new date of birth customer: ");
                    String newDate = scanner.nextLine();
                    customer.setDateOfBirth(newDate);
                    System.out.println("Enter new gender customer: ");
                    String newGender = scanner.nextLine();
                    customer.setGender(newGender);
                    System.out.println("Enter new identity number customer: ");
                    String newIdentityNumber = scanner.nextLine();
                    customer.setIdEntityNumber(newIdentityNumber);
                    System.out.println("Enter new phone number customer: ");
                    String newPhoneNumber = scanner.nextLine();
                    customer.setPhoneNumber(newPhoneNumber);
                    System.out.println("Enter new email customer: ");
                    String newEmail = scanner.nextLine();
                    customer.setEmail(newEmail);

                    System.out.println("Choose new typeCustomer:");
                    System.out.println("1 = Diamond");
                    System.out.println("2 = Platinum");
                    System.out.println("3 = Gold");
                    System.out.println("4 = Silver ");
                    System.out.println("5 = Member");
                    String newTypeCustomer = scanner.nextLine();
                    switch (newTypeCustomer) {
                        case "1": {
                            System.out.println("Diamond");
                            newTypeCustomer = "Diamond";
                            customer.setTypeCustomer(newTypeCustomer);
                            break;
                        }
                        case "2": {
                            System.out.println("Platinum,");
                            newTypeCustomer = "Platinum";
                            customer.setTypeCustomer(newTypeCustomer);
                            break;
                        }
                        case "3": {
                            System.out.println("Gold");
                            newTypeCustomer = "Gold";
                            customer.setTypeCustomer(newTypeCustomer);
                            break;
                        }
                        case "4": {
                            System.out.println("Silver");
                            newTypeCustomer = "Silver";
                            customer.setTypeCustomer(newTypeCustomer);
                            break;
                        }
                        case "5": {
                            System.out.println("Member");
                            newTypeCustomer = "Member";
                            customer.setTypeCustomer(newTypeCustomer);
                            break;
                        }
                        default: {
                            System.out.println("Entered wrong, please re-enter");
                            break;
                        }
                    }

                    System.out.println("Enter new address: ");
                    String address = scanner.nextLine();
                    customer.setAddress(address);
                    ReadAndWriteFile.writeListCustomerToCSV(linkedList, FILE_CUSTOMER,false);
                    break;
                }else {
                    System.out.println("No id need edit .");
                }
            }
        }

    }

    @Override
    public void display() {
        List<Customer> customerList = ReadAndWriteFile.getListCustomerFromCSV(FILE_CUSTOMER);
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
}
