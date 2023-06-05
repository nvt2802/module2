package case_study.repository.impl;

import case_study.model.facility_model.Facility;
import case_study.model.facility_model.House;
import case_study.model.facility_model.Room;
import case_study.model.facility_model.Villa;
import case_study.repository.IFacilityRepository;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static final String VILLA_LIST_PATH = "src/case_study/data/data_villa.csv";
    private static final String ROOM_LIST_PATH = "src/case_study/data/data_room.csv";
    private static final String HOUSE_LIST_PATH = "src/case_study/data/data_house.csv";
    private static final List<Facility> facilityList = new ArrayList<>();
    private static final Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
    private static final Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    private static final Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    private static final Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Integer countVilla = 0;
    public static Integer countHouse = 0;
    public static Integer countRoom = 0;

    static {
    }

    @Override
    public List<Facility> getAll() {
        List<String> villas = ReadAndWriteFile.readFile(VILLA_LIST_PATH);
        List<String> houses = ReadAndWriteFile.readFile(HOUSE_LIST_PATH);
        List<String> rooms = ReadAndWriteFile.readFile(ROOM_LIST_PATH);
        villaIntegerMap.clear();
        houseIntegerMap.clear();
        roomIntegerMap.clear();
        facilityList.clear();
        String[] infoVilla;
        String[] infoHouse;
        String[] infoRoom;
        for (String v : villas) {
            infoVilla = v.split(",");
            villaIntegerMap.put(new Villa(infoVilla[0], infoVilla[1], Integer.parseInt(infoVilla[2]), Integer.parseInt(infoVilla[3]), Integer.parseInt(infoVilla[4]), infoVilla[5], infoVilla[6], Integer.parseInt(infoVilla[7]), Integer.parseInt(infoVilla[8])), countVilla);
        }
        for (String h : houses) {
            infoHouse = h.split(",");
            houseIntegerMap.put(new House(infoHouse[0], infoHouse[1], Integer.parseInt(infoHouse[2]), Integer.parseInt(infoHouse[3]), Integer.parseInt(infoHouse[4]), infoHouse[5], infoHouse[6], Integer.parseInt(infoHouse[7])), countHouse);
        }
        for (String r : rooms) {
            infoRoom = r.split(",");
            roomIntegerMap.put(new Room(infoRoom[0], infoRoom[1], Integer.parseInt(infoRoom[2]), Integer.parseInt(infoRoom[3]), Integer.parseInt(infoRoom[4]), infoRoom[5], infoRoom[6]), countRoom);
        }
        Set<Villa> villaSet = villaIntegerMap.keySet();
        Set<Room> roomSet = roomIntegerMap.keySet();
        Set<House> houseSet = houseIntegerMap.keySet();
        facilityList.addAll(villaSet);
        facilityList.addAll(roomSet);
        facilityList.addAll(houseSet);
        return facilityList;
    }
    public static void setCountVilla(Villa villa){
        int count = villaIntegerMap.get(villa);
        if (count == 5){
            count=0;
        }else {
            count++;
        }
        villaIntegerMap.replace(villa,count);
    }
    public static void setCountHouse(House house){
        int count = houseIntegerMap.get(house);
        if (count == 5){
            count=0;
        }else {
            count++;
        }
        houseIntegerMap.replace(house,count);
    }
    public static void setCountRoom(Room room){
        int count = roomIntegerMap.get(room);
        if (count == 5){
            count=0;
        }else {
            count++;
        }
        roomIntegerMap.replace(room,count);
    }
    @Override
    public void addVilla(Villa villa, boolean append) {
        List<String> villas = ReadAndWriteFile.readFile(VILLA_LIST_PATH);
        villas.add(villa.getServiceID() + "," + villa.getServiceName() + "," + villa.getUsableArea() + "," + villa.getRentalCosts() + "," + villa.getMaximumNumberOfPeople() + "," + villa.getRentalType() + "," + villa.getRoomStandard() + "," + villa.getPoolArea() + "," + villa.getNumberOfFloors());
        ReadAndWriteFile.writeFile(VILLA_LIST_PATH, villas, append);
    }

    @Override
    public void addHouse(House house, boolean append) {
        List<String> houses = ReadAndWriteFile.readFile(HOUSE_LIST_PATH);
        houses.add(house.getServiceID() + "," + house.getServiceName() + "," + house.getUsableArea() + "," + house.getRentalCosts() + "," + house.getMaximumNumberOfPeople() + "," + house.getRentalType() + "," + house.getRoomStandard() + "," + house.getNumberOfFloors());
        ReadAndWriteFile.writeFile(HOUSE_LIST_PATH, houses, append);
    }

    @Override
    public void addRoom(Room room, boolean append) {
        List<String> rooms = ReadAndWriteFile.readFile(ROOM_LIST_PATH);
        rooms.add(room.getServiceID() + "," + room.getServiceName() + "," + room.getUsableArea() + "," + room.getRentalCosts() + "," + room.getMaximumNumberOfPeople() + "," + room.getRentalType() + "," + room.getFreeServiceIncluded());
        ReadAndWriteFile.writeFile(ROOM_LIST_PATH, rooms, append);
    }

    @Override
    public Facility GetByID(String id) {
        List<Facility> facilities = getAll();
        for (Facility f : facilities
        ) {
            if (f.getServiceID().equals(id)) {
                return f;
            }
        }
        return null;
    }

    @Override
    public void delete(Facility facility) {
        List<Facility> facilities = getAll();
        facilities.remove(facility);
        List<String> stringList = new ArrayList<>();
        if (facility instanceof Villa) {
            for (Facility f : facilities) {
                if (f instanceof Villa) {
                    stringList.add(f.getServiceID() + "," + f.getServiceName() + "," + f.getUsableArea() + "," + f.getRentalCosts() + "," + f.getMaximumNumberOfPeople() + "," + f.getRentalType() + "," + ((Villa) f).getRoomStandard() + "," + ((Villa) f).getPoolArea() + "," + ((Villa) f).getNumberOfFloors());
                }
            }
            ReadAndWriteFile.writeFile(VILLA_LIST_PATH, stringList, false);
        }
        if (facility instanceof House) {
            for (Facility f : facilities) {

                if (f instanceof House) {
                    stringList.add(f.getServiceID() + "," + f.getServiceName() + "," + f.getUsableArea() + "," + f.getRentalCosts() + "," + f.getMaximumNumberOfPeople() + "," + f.getRentalType() + "," + ((House) f).getRoomStandard() + "," + ((House) f).getNumberOfFloors());
                }
            }
            ReadAndWriteFile.writeFile(HOUSE_LIST_PATH, stringList, false);
        }
        if (facility instanceof Room) {
            for (Facility f : facilities) {
                if (f instanceof Room) {
                    stringList.add(f.getServiceID() + "," + f.getServiceName() + "," + f.getUsableArea() + "," + f.getRentalCosts() + "," + f.getMaximumNumberOfPeople() + "," + f.getRentalType() + "," + ((Room) f).getFreeServiceIncluded());
                }
                ReadAndWriteFile.writeFile(ROOM_LIST_PATH, stringList, false);
            }
        }
    }

    @Override
    public List<Facility> getAllMaintenance() {
        List<Facility> facilities = new ArrayList<>();
        facilityIntegerMap.clear();
        facilityIntegerMap.putAll(villaIntegerMap);
        facilityIntegerMap.putAll(houseIntegerMap);
        facilityIntegerMap.putAll(roomIntegerMap);
        Set<Facility> key = facilityIntegerMap.keySet();
        for (Facility k:key) {
            if(facilityIntegerMap.get(k)>=5){
                facilities.add(k);
            }
        }
        return facilities;
    }
}
