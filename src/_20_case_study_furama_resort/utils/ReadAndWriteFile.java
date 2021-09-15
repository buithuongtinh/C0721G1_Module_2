package _20_case_study_furama_resort.utils;

import _20_case_study_furama_resort.models.*;

import java.io.*;
import java.util.*;

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

    public static void writeListHouseCSV(List<House> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (House house : list){
            stringList.add(house.getHouseToString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListRoomCSV(List<Room> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Room room : list){
            stringList.add(room.getRoomToString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListVillaCSV(List<Villa> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Villa villa : list){
            stringList.add(villa.getVillaToString());
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
    public static void writeListFacilityCSV(Map<Facility,Integer> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        Set<Facility> facilitySet = list.keySet();
        for (Facility facility : facilitySet){
            String keySet = facility.getNameService() + ","+list.get(facility);
            stringList.add(keySet);
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static List<House> getListHouseFromCSV(String path) {
        List<House> houses = new ArrayList<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            House house = new House(array[0],Double.parseDouble(array[1]), Double.parseDouble(array[2]),Integer.parseInt(array[3]),
                    array[4],array[5],Integer.parseInt(array[6]));
            houses.add(house);
        }
        return houses;
    }
    public static List<Room> getListRoomFromCSV(String path) {
        List<Room> rooms = new ArrayList<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            Room room = new Room(array[0],Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                    Integer.parseInt(array[4]), array[5], array[6]);
            rooms.add(room);
        }
        return rooms;
    }
    public static List<Villa> getListVillaFromCSV(String path) {
        List<Villa> villas = new ArrayList<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            Villa villa = new Villa(array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]),
                    Integer.parseInt(array[3]), array[4], array[5],Double.parseDouble(array[6]),Integer.parseInt(array[7]));
            villas.add(villa);
        }
        return villas;
    }
}
