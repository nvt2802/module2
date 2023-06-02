package case_study.model.facility_model;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceID, String serviceName, int usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceID, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
