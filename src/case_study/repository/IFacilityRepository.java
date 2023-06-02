package case_study.repository;

import case_study.model.facility_model.Facility;
import case_study.model.facility_model.House;
import case_study.model.facility_model.Room;
import case_study.model.facility_model.Villa;

public interface IFacilityRepository extends Repository<Facility> {
    void addVilla(Villa villa);

    void addHouse(House house);

    void addRoom(Room room);
}
