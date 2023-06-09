package case_study.service.impl;

import case_study.model.Booking;
import case_study.model.facility_model.Facility;
import case_study.model.person_model.Customer;
import case_study.repository.IBookingRepository;
import case_study.repository.ICustomerRepository;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.BookingRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IBookingService;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class BookingService implements IBookingService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomerRepository customerRepository = new CustomerRepository();
    private static final IFacilityRepository facilityRepository = new FacilityRepository();
    private static final IBookingRepository bookingRepository = new BookingRepository();

    @Override
    public void display() {
        List<Booking> bookingList = bookingRepository.getAll();
        for (Booking b : bookingList
        ) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer c : customerList) {
            System.out.println(c);
        }
        Customer customer;
        do {
            System.out.println("Input Customer ID to booking:");
            String idCustomer = scanner.nextLine();
            customer = customerRepository.getByID(idCustomer);
            if (customer == null) {
                System.out.println("Can't find this Customer!");
            } else {
                break;
            }
        } while (true);
        List<Facility> facilityList = facilityRepository.getAll();
        for (Facility f : facilityList) {
            System.out.println(f);
        }
        Facility facility;
        do {
            System.out.println("Input Service ID to booking for customer:");
            String idService = scanner.nextLine();
            facility = facilityRepository.GetByID(idService);
            if (facility == null) {
                System.out.println("Can't find this facility!");
            } else {
                break;
            }
        } while (true);
        String idBooking;
        do {
            System.out.println("Input booking id:");
            idBooking = scanner.nextLine();
        } while (Regex.getRegexBookingID(idBooking));
        String dayBooking;
        do {
            System.out.println("Input day booking:");
            dayBooking = scanner.nextLine();
            if (!dayBooking.matches(Regex.REGEX_DATE)) {
                System.out.println("Not date format!");
            } else {
                break;
            }
        } while (true);
        String rentalStartDate;
        do {
            System.out.println("Input start date booking:");
            rentalStartDate = scanner.nextLine();
            if (!rentalStartDate.matches(Regex.REGEX_DATE)) {
                System.out.println("Not date format!");
            } else {
                break;
            }
        } while (true);
        String leaseEndDate;
        do {
            System.out.println("Input lease end date:");
            leaseEndDate = scanner.nextLine();
            if (!leaseEndDate.matches(Regex.REGEX_DATE)) {
                System.out.println("Not date format!");
            } else {
                break;
            }
        } while (true);
        Booking booking = new Booking(idBooking, dayBooking, rentalStartDate, leaseEndDate, customer.getID(), facility.getServiceID());
        bookingRepository.add(booking);
    }
//Booking(String bookingID, String dayBooking, String rentalStartDate, String leaseEndDate, String customerID, String serviceID) {
}
