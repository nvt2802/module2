package case_study.model.facility_model;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceID, String serviceName, int usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceID, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
