package case_study.repository.impl;

import case_study.model.facility_model.Facility;
import case_study.model.facility_model.House;
import case_study.model.facility_model.Room;
import case_study.model.facility_model.Villa;
import case_study.repository.IFacilityRepository;
import case_study.utils.ReadAndWriteFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
        private static final String VILLA_LIST_PATH="src/case_study/model/facility_model/Villa.java";
        private static final String ROOM_LIST_PATH="src/case_study/model/facility_model/Room.java";
        private static final String HOUSE_LIST_PATH="src/case_study/model/facility_model/House.java";
        private static final Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
        private static final Integer count = 0;

        static {
        }
        @Override
        public List<Facility> getAll() {
                return null;
        }

        @Override
        public void add(Facility object) {

        }
//Villa(String serviceID, String serviceName, int usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, int poolArea, int numberOfFloors) {
//
        @Override
        public void addVilla(Villa villa) {
                List<String> villas = ReadAndWriteFile.readFile(VILLA_LIST_PATH);
                villas.add(villa.getServiceID()+","+villa.getServiceName()+","+villa.getUsableArea()+","+villa.getRentalCosts()+","+villa.getMaximumNumberOfPeople()+","+villa.getRentalType()+","+villa.getRoomStandard()+","+villa.getPoolArea()+","+villa.getNumberOfFloors());
                ReadAndWriteFile.writeFile(VILLA_LIST_PATH,villas,false);
        }

        @Override
        public void addHouse(House house) {
                List<String> houses = ReadAndWriteFile.readFile(HOUSE_LIST_PATH);
                houses.add(house.getServiceID()+","+house.getServiceName()+","+house.getUsableArea()+","+house.getRentalCosts()+","+house.getMaximumNumberOfPeople()+","+house.getRentalType()+","+house.getRoomStandard()+","+house.getNumberOfFloors());
                ReadAndWriteFile.writeFile(HOUSE_LIST_PATH,houses,false);
        }

        @Override
        public void addRoom(Room room) {
                List<String> roooms = ReadAndWriteFile.readFile(HOUSE_LIST_PATH);
                roooms.add(room.getServiceID()+","+room.getServiceName()+","+room.getUsableArea()+","+room.getRentalCosts()+","+room.getMaximumNumberOfPeople()+","+room.getRentalType()+","+room.getFreeServiceIncluded());
                ReadAndWriteFile.writeFile(HOUSE_LIST_PATH,roooms,false);
        }
}
