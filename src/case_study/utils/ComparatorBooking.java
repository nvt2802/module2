package case_study.utils;

import case_study.model.Booking;

import java.awt.print.Book;
import java.util.Comparator;

public class ComparatorBooking implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getRentalStartDate().equals(o2.getRentalStartDate())) {
            return o1.getLeaseEndDate().compareTo(o2.getLeaseEndDate());
        } else {
            return o1.getRentalStartDate().compareTo(o2.getRentalStartDate());
        }
    }
}
