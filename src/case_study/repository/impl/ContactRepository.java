package case_study.repository.impl;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.repository.IBookingRepository;
import case_study.repository.IContactRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ContactRepository implements IContactRepository {
    private static List<Contract> contractList = new ArrayList<>();
    private static Queue<Booking> bookingQueue = new LinkedList<>();
    private static IBookingRepository bookingRepository = new BookingRepository();

    static {
        bookingQueue = bookingRepository.getAllQueue();
    }

    @Override
    public List<Contract> getAll() {
        return new ArrayList<>(contractList);
    }


    @Override
    public void add(Contract contract) {
        contractList.add(contract);
    }

    @Override
    public int getIndexById(String id) {
        List<Contract> contracts = getAll();
        for (Contract c : contracts
        ) {
            if (c.getContractID().equals(id)) {
                return contracts.indexOf(c);
            }
        }
        return -1;
    }

    @Override
    public void edit(Contract contract, int index) {
        contractList.set(index, contract);
    }

    @Override
    public Contract getByid(String id) {
        List<Contract> contracts = getAll();
        for (Contract c : contracts
        ) {
            if (c.getContractID().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Booking getPollBooking() {
        System.out.println(bookingQueue);
        if (bookingQueue.isEmpty()) {
            return null;
        }
        return bookingQueue.poll();
    }
}
