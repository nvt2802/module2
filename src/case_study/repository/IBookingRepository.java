package case_study.repository;

import case_study.model.Booking;

import java.util.Queue;

public interface IBookingRepository extends Repository<Booking> {
   void add(Booking booking) ;

   Queue<Booking> getAllQueue();


}
