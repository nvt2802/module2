package case_study.repository;

import case_study.model.Booking;
import case_study.model.Contract;

public interface IContactRepository extends Repository<Contract> {
    void add(Contract contract);

    int getIndexById(String id);

    void edit(Contract contractFind,int index);

    Contract getByid(String id);

    Booking getPollBooking();
}
