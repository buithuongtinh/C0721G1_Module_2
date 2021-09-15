package _20_case_study_furama_resort.models;

public abstract class Facility {
    private String nameService;
    private double useArea;
    private double rentCost;
    private int maxNumPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String nameService, double useArea, double rentCost, int maxNumPeople, String typeRent) {
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentCost = rentCost;
        this.maxNumPeople = maxNumPeople;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxNumPeople() {
        return maxNumPeople;
    }

    public void setMaxNumPeople(int maxNumPeople) {
        this.maxNumPeople = maxNumPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentCost=" + rentCost +
                ", maxNumPeople=" + maxNumPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
    public String getFacilityToString(){
        return this.getNameService()+","+this.getUseArea()+","+this.getRentCost()+","+this.getMaxNumPeople()+","+this.getTypeRent();

    }
}
