package case_study.repository.impl;

import case_study.model.Booking;
import case_study.model.facility_model.Facility;
import case_study.model.facility_model.House;
import case_study.model.facility_model.Room;
import case_study.model.facility_model.Villa;
import case_study.repository.IBookingRepository;
import case_study.repository.IFacilityRepository;
import case_study.utils.ComparatorBooking;

import java.util.*;

public class BookingRepository implements IBookingRepository {
    private static Set<Booking> bookings = new TreeSet<>(new ComparatorBooking());
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    static {
        bookings.add(new Booking("BK-0001", "06/06/2023", "07/06/2023", "20/06/2023", "KH-0000", "SVVL-0001"));
        bookings.add(new Booking("BK-0002", "07/06/2023", "08/06/2023", "20/06/2023", "KH-0000", "SVVL-0001"));
        bookings.add(new Booking("BK-0003", "08/06/2023", "09/06/2023", "20/06/2023", "KH-0000", "SVVL-0001"));
        //(String bookingID, String dayBooking, String rentalStartDate, String leaseEndDate, String customerID, String serviceID) {
    }

    @Override
    public List<Booking> getAll() {
        return new ArrayList<>(bookings);
    }

    @Override
    public void add(Booking booking) {
        String idService = booking.getServiceID();
        List<Facility> facilities = facilityRepository.getAll();
        for (Facility f : facilities) {
            if (f instanceof Villa && f.getServiceID().equals(idService)) {
                FacilityRepository.setCountVilla((Villa) f);
            }
            if (f instanceof Room && f.getServiceID().equals(idService)) {
                FacilityRepository.setCountRoom((Room) f);
            }
            if (f instanceof House && f.getServiceID().equals(idService)) {
                FacilityRepository.setCountHouse((House) f);
            }
        }
        bookings.add(booking);
    }

    @Override
    public Queue<Booking> getAllQueue() {
        return new LinkedList<>(bookings);
    }
}
