package _20_case_study_furama_resort.models;

public class Villa extends Facility{
    private String standard;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String standard, double poolArea, int floor) {
        this.standard = standard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String nameService, double useArea, double rentCost, int maxNumPeople, String typeRent, String standard, double poolArea, int floor) {
        super(nameService, useArea, rentCost, maxNumPeople, typeRent);
        this.standard = standard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                "} " + super.toString();
    }
}
