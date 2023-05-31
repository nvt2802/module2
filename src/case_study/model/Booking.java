package case_study.model;

public class Booking {
    private String bookingID;
    private String dayBooking;
    private String rentalStartDate;
    private String leaseEndDate;
    private String customerID;
    private String serviceID;

    public Booking(String bookingID, String dayBooking, String rentalStartDate, String leaseEndDate, String customerID, String serviceID) {
        this.bookingID = bookingID;
        this.dayBooking = dayBooking;
        this.rentalStartDate = rentalStartDate;
        this.leaseEndDate = leaseEndDate;
        this.customerID = customerID;
        this.serviceID = serviceID;
    }
    public Booking(){}

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(String leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", dayBooking='" + dayBooking + '\'' +
                ", rentalStartDate='" + rentalStartDate + '\'' +
                ", leaseEndDate='" + leaseEndDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", serviceID='" + serviceID + '\'' +
                '}';
    }
}
