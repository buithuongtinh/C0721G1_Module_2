package _20_case_study_furama_resort.services.class_service;

import _20_case_study_furama_resort.libs.Exception;
import _20_case_study_furama_resort.models.Employee;
import _20_case_study_furama_resort.services.EmployeeService;
import _20_case_study_furama_resort.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl extends Exception implements EmployeeService {
    public static List<Employee> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    final String FILE_EMPLOYEE = "src\\_20_case_study_furama_resort\\data\\employee.csv";


    @Override
    public void add() {
        int id  ;
        if (list.isEmpty()){
            id =1 ;
        }else {
            id = list.get(list.size() - 1).getId() +1;
        }
        System.out.println("Enter  name: ");
        String name = scanner.nextLine();
        System.out.println("Enter  date of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter identity number: ");
        String identityNumber = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Choose literacy:");
        System.out.println("1: Trung cấp");
        System.out.println("2: Cao Đẳng");
        System.out.println("3: Đại học");
        System.out.println("4: sau Đại học");
        String literacy = scanner.nextLine();
        switch (literacy) {
            case "1": {
                System.out.println("Trung cấp");
                literacy = "Trung cấp";
                break;
            }
            case "2": {
                System.out.println("Cao Đẳng ");
                literacy = "Cao Đẳng";
                break;
            }
            case "3": {
                System.out.println("Đại học");
                literacy = "Đại học";
                break;
            }
            case "4": {
                System.out.println("sau Đại học");
                literacy = "sau Đại học";
                break;
            }
            default: {
                System.out.println("Entered wrong, please re-enter");
                break;
            }
        }
        System.out.println("Choose position: ");
        System.out.println("1: Lễ tân");
        System.out.println("2: Phục vụ");
        System.out.println("3: Chuyên viên");
        System.out.println("4: Giám sát");
        System.out.println("5: Quản lí");
        System.out.println("6: Giám đốc");
        String position = scanner.nextLine();
        switch (position) {
            case "1": {
                System.out.println("Lễ tân");
                position = "Lễ tân";
                break;
            }
            case "2": {
                System.out.println("Phục vụ");
                position = "Phục vụ";
                break;
            }
            case "3": {
                System.out.println("Chuyên viên");
                position = "Chuyên viên";
                break;
            }
            case "4": {
                System.out.println("Giám sát");
                position = "Giám sát";
                break;
            }
            case "5": {
                System.out.println("Quản lí");
                position = "Quản lí";
                break;
            }
            case "6": {
                System.out.println("Giám đốc");
                position = "Giám đốc";
                break;
            }
            default: {
                System.out.println("Entered wrong, please re-enter");
                break;
            }
        }
        System.out.println("Enter salary: ");
        double  salary = Double.parseDouble(scanner.nextLine());
        list.add(new Employee(id,name,dateOfBirth,gender,identityNumber,phoneNumber,email,literacy,position,salary));
        ReadAndWriteFile.writeListEmployeeToCSV(list ,FILE_EMPLOYEE,false);
        
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {
        List<Employee> list = ReadAndWriteFile.getListEmployeeFromCSV(FILE_EMPLOYEE);
        System.out.println("Enter id need to edit: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        if (list.isEmpty()){
            System.out.println("Nothing to edit");
        }else {
            for (Employee employee :list){
                if (employee.getId()== idEdit){
                    System.out.println("Enter new name: ");
                    String newName = scanner.nextLine();
                    employee.setName(newName);
                    System.out.println("Enter new date of birth: ");
                    String newDate = scanner.nextLine();
                    employee.setDateOfBirth(newDate);
                    System.out.println("Enter new gender: ");
                    String newGender = scanner.nextLine();
                    employee.setGender(newGender);
                    System.out.println("Enter new identity number: ");
                    String newIdentityNumber = scanner.nextLine();
                    employee.setIdEntityNumber(newIdentityNumber);
                    System.out.println("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    employee.setPhoneNumber(newPhoneNumber);
                    System.out.println("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    employee.setEmail(newEmail);

                    System.out.println("Choose new literacy: ");
                    System.out.println("1: Trung cấp");
                    System.out.println("2: Cao Đẳng");
                    System.out.println("3: Đại học");
                    System.out.println("4: sau Đại học");
                    String newLiteracy =scanner.nextLine();
                    switch (newLiteracy) {
                        case "1": {
                            System.out.println("Trung cấp");
                            newLiteracy = "Trung cấp";
                            employee.setLiteracy(newLiteracy);
                            break;
                        }
                        case "2": {
                            System.out.println("Cao Đẳng ");
                            newLiteracy = "Cao Đẳng";
                            employee.setLiteracy(newLiteracy);
                            break;
                        }
                        case "3": {
                            System.out.println("Đại học");
                            newLiteracy = "Đại học";
                            employee.setLiteracy(newLiteracy);
                            break;
                        }
                        case "4": {
                            System.out.println("sau Đại học");
                            newLiteracy = "sau Đại học";
                            employee.setLiteracy(newLiteracy);
                            break;
                        }
                        default: {
                            System.out.println("Entered wrong, please re-enter");
                            break;
                        }
                    }

                    System.out.println("Enter new position: ");
                    System.out.println("1: Lễ tân");
                    System.out.println("2: Phục vụ");
                    System.out.println("3: Chuyên viên");
                    System.out.println("4: Giám sát");
                    System.out.println("5: Quản lí");
                    System.out.println("6: Giám đốc");
                    String newPosition = scanner.nextLine();
                    switch (newPosition) {
                        case "1": {
                            System.out.println("Lễ tân");
                            newPosition = "Lễ tân";
                            employee.setPosition(newPosition);
                            break;
                        }
                        case "2": {
                            System.out.println("Phục vụ");
                            newPosition = "Phục vụ";
                            employee.setPosition(newPosition);
                            break;
                        }
                        case "3": {
                            System.out.println("Chuyên viên");
                            newPosition = "Chuyên viên";
                            employee.setPosition(newPosition);
                            break;
                        }
                        case "4": {
                            System.out.println("Giám sát");
                            newPosition = "Giám sát";
                            employee.setPosition(newPosition);
                            break;
                        }
                        case "5": {
                            System.out.println("Quản lí");
                            newPosition = "Quản lí";
                            employee.setPosition(newPosition);
                            break;
                        }
                        case "6": {
                            System.out.println("Giám đốc");
                            newPosition = "Giám đốc";
                            employee.setPosition(newPosition);
                            break;
                        }
                        default: {
                            System.out.println("Entered wrong, please re-enter");
                            break;
                        }
                    }

                    employee.setPosition(newPosition);
                    System.out.println("Enter new salary: ");
                    double newSalary = Double.parseDouble(scanner.nextLine());
                    employee.setSalary(newSalary);
                    ReadAndWriteFile.writeListEmployeeToCSV(list,FILE_EMPLOYEE,false);
                    break;
                }else {
                    System.out.println("No id need edit .");
                }
            }
        }
    }

    @Override
    public void display() {
        List<Employee> employees = ReadAndWriteFile.getListEmployeeFromCSV(FILE_EMPLOYEE);
        for (int i = 0; i < employees.size(); i ++){
            System.out.println(i + 1 + ". " + employees.get(i));
        }

    }
}
