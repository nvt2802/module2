package case_study.repository;

import case_study.model.Booking;

public interface IBookingRepository extends Repository<Booking> {
   void add(Booking booking) ;
}
