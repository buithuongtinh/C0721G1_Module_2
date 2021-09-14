package _20_case_study_furama_resort.utils;

import _20_case_study_furama_resort.models.Customer;
import _20_case_study_furama_resort.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteFile {
    private static void writeListStringToCSV(List<String> stringList, String path, boolean append){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writer file");
        }

    }

    public static void writeListEmployeeToCSV(List<Employee> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Employee employee : list){
            stringList.add(employee.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListCustomerToCSV(List<Customer> list, String path, boolean append){
        List<String> stringList =new LinkedList<>();
        for (Customer customerList : list){
            stringList.add(customerList.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }




    public static List<String> readCSV(String path){
        File file = new File(path);
        List<String> listString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                listString.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reader file");
        }
        return listString;
    }
    public static List<Employee> getListEmployeeFromCSV(String path){
        List<Employee> employeeList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Employee employee = new Employee(Integer.parseInt(array[0]),array[1],array[2],array[3],
                    array[4],array[5],array[6],array[7],array[8],Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }
    public static List<Customer> getListCustomerFromCSV(String path){
        List<Customer> customersList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Customer customer = new Customer(Integer.parseInt(array[0]),array[1],array[2],array[3],
                    array[4],array[5],array[6],array[7],array[8]);
            customersList.add(customer);
        }
        return customersList;
    }
}
