package case_study.model;

public class Facility {
    private String serviceName;
    private Double usableArea;
    private int RentalCosts;
    private int MaximumNumberOfPeople;
    private String RentalType;


    public Facility() {
    }

    public Facility(String serviceName, Double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        RentalCosts = rentalCosts;
        MaximumNumberOfPeople = maximumNumberOfPeople;
        RentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return RentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        RentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return MaximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        MaximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return RentalType;
    }

    public void setRentalType(String rentalType) {
        RentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", RentalCosts=" + RentalCosts +
                ", MaximumNumberOfPeople=" + MaximumNumberOfPeople +
                ", RentalType='" + RentalType + '\'' +
                '}';
    }
}



