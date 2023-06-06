package case_study.utils;

import case_study.model.Booking;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Comparator;

public class ComparatorBooking implements Comparator<Booking> {
    private static DateTimeFormatter dateTimeFormatter;
    private LocalDate rentalStartDate1 = null;
    private LocalDate rentalStartDate2 = null;
    private LocalDate leaseEndDate1 = null;
    private LocalDate leaseEndDate2 = null;

    @Override
    public int compare(Booking o1, Booking o2) {
        try {
            dateTimeFormatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            rentalStartDate1 = LocalDate.parse(o1.getRentalStartDate(), dateTimeFormatter);
            rentalStartDate2 = LocalDate.parse(o2.getRentalStartDate(), dateTimeFormatter);
            leaseEndDate1 = LocalDate.parse(o1.getLeaseEndDate(), dateTimeFormatter);
            leaseEndDate2 = LocalDate.parse(o2.getLeaseEndDate(), dateTimeFormatter);
        } catch (DateTimeParseException | NullPointerException dateTimeParseException) {
            System.out.println("Date is not date format");
            return 0;
        }
        if (rentalStartDate1.equals(rentalStartDate2)) {
            return leaseEndDate1.compareTo(leaseEndDate2);
        } else {
            return rentalStartDate1.compareTo(rentalStartDate2);
        }
    }
}
