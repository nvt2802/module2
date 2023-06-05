package case_study.repository;

import case_study.model.facility_model.Facility;
import case_study.model.facility_model.House;
import case_study.model.facility_model.Room;
import case_study.model.facility_model.Villa;

import java.util.List;

public interface IFacilityRepository extends Repository<Facility> {
    void addVilla(Villa villa,boolean append);

    void addHouse(House house,boolean append);

    void addRoom(Room room,boolean append);

    Facility GetByID(String idDelete);

    void delete(Facility facility);

    List<Facility> getAllMaintenance();
}
