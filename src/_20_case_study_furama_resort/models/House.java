package _20_case_study_furama_resort.models;

public class House extends Facility{
    private String standardHouse ;
    private int floor;

    public House() {
    }

    public House(String standardHouse, int floor) {
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public House(String nameService, double useArea, double rentCost, int maxNumPeople, String typeRent, String standardHouse, int floor) {
        super(nameService, useArea, rentCost, maxNumPeople, typeRent);
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardHouse='" + standardHouse + '\'' +
                ", floor=" + floor +
                "} " + super.toString();
    }
    public String getHouseToString() {
        return super.getFacilityToString()+","+this.getStandardHouse()+","+this.getFloor();
    }
}
