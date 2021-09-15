package _20_case_study_furama_resort.services.class_service;

import _20_case_study_furama_resort.models.Facility;
import _20_case_study_furama_resort.models.House;
import _20_case_study_furama_resort.models.Room;
import _20_case_study_furama_resort.models.Villa;
import _20_case_study_furama_resort.services.FacilityService;
import _20_case_study_furama_resort.utils.ReadAndWriteFile;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);

    public static Map<Facility, Integer> facility = new LinkedHashMap<>();
    private static final String FILE_PATH_VILLA
            = "src\\_20_case_study_furama_resort\\data\\villa.csv";
    private static final String FILE_PATH_HOUSE
            = "src\\_20_case_study_furama_resort\\data\\house.csv";
    private static final String FILE_PATH_ROOM
            = "src\\_20_case_study_furama_resort\\data\\room.csv";
    private static final String FILE_FACILITY
            = "src\\_20_case_study_furama_resort\\data\\facility.csv";


    @Override
    public void add() {
        System.out.println("Enter Facility service you want to choose");
        System.out.println("Choose 1: Add new Villa");
        System.out.println("Choose 2: Add new House");
        System.out.println("Choose 3: Add new Room");
        String choose = scanner.nextLine();
        switch (choose){
            case "1": {
                addNewVilla();;
                break;
            }
            case "2": {
                addNewHouse();
                break;
            }
            case "3": {
                addNewRoom();
                break;
            }
            default: {
                System.exit(1);
                break;
            }
        }

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        List<House> houses =ReadAndWriteFile.getListHouseFromCSV(FILE_PATH_HOUSE);
        List<Room> rooms = ReadAndWriteFile.getListRoomFromCSV(FILE_PATH_ROOM);
        List<Villa> villas =ReadAndWriteFile.getListVillaFromCSV(FILE_PATH_VILLA);
        System.out.println("List Houses: ");
        for (int i = 0; i < houses.size(); i++) {
            System.out.println(i + 1 + ". " + houses.get(i));
        }
        System.out.println("List Rooms: ");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(i + 1 + ". " + rooms.get(i));
        }
        System.out.println("List Villas: ");
        for (int i = 0; i < villas.size(); i++) {
            System.out.println(i + 1 + ". " + villas.get(i));
        }

    }

    @Override
    public void addNewVilla() {


        System.out.println("Add new name Service:");
        String nameService = scanner.nextLine();

        System.out.println("Add new use area:");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Add new cost rent:");
        double rentCost = Double.parseDouble(scanner.nextLine());

        System.out.println("Add new maximum number of people:");
        int maximum = Integer.parseInt(scanner.nextLine());

        System.out.println("Add new type rent:");
        String typeRent = scanner.nextLine();

        System.out.println("Add new Standard:");
        String standard = scanner.nextLine();
        System.out.println("Add new swimming pool area:");
        double poolArea = Double.parseDouble(scanner.nextLine());

        System.out.println("Add new floor:");
        int floorV = Integer.parseInt(scanner.nextLine());
        Villa villa =new Villa(nameService,area,rentCost,maximum,typeRent,standard,poolArea,floorV);
        List<Villa> villas = new ArrayList<>();
        villas.add(villa);
        ReadAndWriteFile.writeListVillaCSV(villas,FILE_PATH_VILLA,true);
        facility.put(villa,0);
        ReadAndWriteFile.writeListFacilityCSV(facility,FILE_FACILITY,true);

    }

    @Override
    public void addNewHouse() {
        System.out.println("Add new name Service:");
        String service = scanner.nextLine();;

        System.out.println("Add new area:");
        double area = Double.parseDouble(scanner.nextLine());;
        System.out.println("Add new cost rent:");
        double rentCost = Double.parseDouble(scanner.nextLine());;

        System.out.println("Add new maximum number of people:");
        int maPeople = Integer.parseInt(scanner.nextLine());;

        System.out.println("Add new type rent:");
        String typeRent = scanner.nextLine();;

        System.out.println("Add new Standard:");
        String standard = scanner.nextLine();;
        System.out.println("Add new number Of Floors:");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(service,area,rentCost,maPeople,typeRent,standard,floor);
        List<House> houses = new ArrayList<>();
        houses.add(house);
        ReadAndWriteFile.writeListHouseCSV(houses,FILE_PATH_HOUSE,true);
        facility.put(house,0);
        ReadAndWriteFile.writeListFacilityCSV(facility,FILE_FACILITY,true);
    }

    @Override
    public void addNewRoom() {

        System.out.println("Add new name Service:");
        String nameServiceR = scanner.nextLine();

        System.out.println("Add new use area:");
        double areaR= Double.parseDouble(scanner.nextLine());
        System.out.println("Add new cost rent:");
        double rentCostR = Double.parseDouble(scanner.nextLine());

        System.out.println("Add new maximum number of people:");
        int maximumR = Integer.parseInt(scanner.nextLine());

        System.out.println("Add new type rent:");
        String typeRentR = scanner.nextLine();
        System.out.println("Add new free service");
        String freeService = scanner.nextLine();

        Room room = new Room(nameServiceR,areaR,rentCostR,maximumR,typeRentR,freeService);
        List<Room> rooms =new ArrayList<>();
        rooms.add(room);
        ReadAndWriteFile.writeListRoomCSV(rooms,FILE_PATH_ROOM,true);
        facility.put(room,0);
        ReadAndWriteFile.writeListFacilityCSV(facility,FILE_FACILITY,true);

    }

}
