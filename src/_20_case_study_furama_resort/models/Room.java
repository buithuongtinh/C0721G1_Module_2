package _20_case_study_furama_resort.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, double useArea, double rentCost, int maxNumPeople, String typeRent, String freeService) {
        super(nameService, useArea, rentCost, maxNumPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }

    public String getRoomToString() {
        return super.getFacilityToString()+","+this.getFreeService();
    }
}
