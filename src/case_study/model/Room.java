package case_study.model;

public class Room extends Facility{
    private String freeService;

    public Room(String serviceName, Double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
