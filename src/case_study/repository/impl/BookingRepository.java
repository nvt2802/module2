package case_study.repository.impl;

import case_study.model.Booking;
import case_study.model.facility_model.Facility;
import case_study.model.facility_model.House;
import case_study.model.facility_model.Room;
import case_study.model.facility_model.Villa;
import case_study.repository.IBookingRepository;
import case_study.repository.IFacilityRepository;
import case_study.utils.ComparatorBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static Set<Booking> bookings= new TreeSet<>(new ComparatorBooking());
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public List<Booking> getAll() {
        return new ArrayList<>(bookings);
    }

    @Override
    public void add(Booking booking) {
        String idService=booking.getServiceID();
        List<Facility> facilities = facilityRepository.getAll();
        for (Facility f: facilities) {
            if(f instanceof Villa &&f.getServiceID().equals(idService)){
                FacilityRepository.setCountVilla((Villa) f);
            }
            if(f instanceof Room && f.getServiceID().equals(idService)){
                FacilityRepository.setCountRoom((Room) f);
            }
            if(f instanceof House && f.getServiceID().equals(idService)){
                FacilityRepository.setCountHouse((House) f);
            }
        }
        bookings.add(booking);
    }
}
