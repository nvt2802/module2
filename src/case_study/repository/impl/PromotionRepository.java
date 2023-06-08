package case_study.repository.impl;

import case_study.model.Booking;
import case_study.model.person_model.Customer;
import case_study.repository.IBookingRepository;
import case_study.repository.ICustomerRepository;
import case_study.repository.IPromotionRepository;
import case_study.utils.ComparatorBooking;

import java.time.LocalDateTime;
import java.util.*;

public class PromotionRepository implements IPromotionRepository {
    private static Set<Customer> customerSet = new TreeSet<>(new Comparator<Customer>() {
        @Override
        public int compare(Customer o1, Customer o2) {
            return 0;
        }
    });
    private static IBookingRepository bookingRepository = new BookingRepository();
    private static ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> getCustomerUseServiceByYear(String year) {
        List<Booking> bookings = bookingRepository.getAll();
        for (Booking b:bookings
             ) {
            if(b.getDayBooking().substring(6).equals(year)) {
                customerSet.add(customerRepository.getByID(b.getCustomerID()));
            }
        }
        return new ArrayList<>(customerSet);
    }

    @Override
    public List<Customer> displayListCustomerGetVoucher() {
        List<Booking> bookings = bookingRepository.getAll();
        Stack<Customer> customerStack = new Stack<>();
        for (Booking b:bookings
        ) {
            if(Integer.parseInt(b.getDayBooking().substring(3,5))==(LocalDateTime.now().getMonthValue())) {
                customerStack.push(customerRepository.getByID(b.getCustomerID()));
            }
        }
        return new ArrayList<>(customerStack);
    }
}
