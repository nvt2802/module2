package case_study.service.impl;

import case_study.controller.FuramaController;
import case_study.model.facility_model.Facility;
import case_study.model.facility_model.House;
import case_study.model.facility_model.Room;
import case_study.model.facility_model.Villa;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IFacilityService;
import case_study.utils.Regex;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        List<Facility> facilityList = facilityRepository.getAll();
        for (Facility f:facilityList) {
            System.out.println(f);
        }
    }

    @Override
    public void add() {
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n");
        byte choice = Byte.parseByte(scanner.nextLine());
        switch (choice) {
            case 1:
                Villa villa=addVilla();
                facilityRepository.addVilla(villa,false);
                break;
            case 2:
                //House(serviceID,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,numberOfFloors)
                House house = addHouse();
                facilityRepository.addHouse(house,false);
                break;
            case 3:
                //Room(serviceID,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,freeServiceIncluded)
                Room room = addRoom();
                facilityRepository.addRoom(room,false);
                break;
            case 4:
                break;
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {
        System.out.println("Input ID service to delete:");
        String idDelete = scanner.nextLine();
        Facility facility = facilityRepository.GetByID(idDelete);
        if(facility==null){
            System.out.println("Can't find this facility!");
        }else {
            System.out.println("Are you sure to delete this facility");
            System.out.println("Input 'Yes' to delete:");
            String choiceDelete= scanner.nextLine();
            if(choiceDelete.equals("Yes")){
                facilityRepository.delete(facility);
                System.out.println("Delete complete!");
            }
        }
    }

    @Override
    public void search() {

    }
    public Room addRoom(){
        String id = null;
        id = Regex.getRegexFacilityId(id);
        String serviceName = null;
        serviceName = Regex.getRegexFacilityName(serviceName);
        int usableArea = 0;
        usableArea = Regex.getRegexArea(usableArea);
        int rentalCosts = 0;
        rentalCosts = Regex.getRegexRentalCosts(rentalCosts);
        int maximumNumberOfPeople = 0;
        maximumNumberOfPeople = Regex.getRegexMaximumNumberOfPeople(maximumNumberOfPeople);
        String rentalType = null;
        do {
            byte choice = 0;
            System.out.println("Input rental type\n" +
                    "1. Hours\n"+
                    "2. Days\n"+
                    "3. Moths\n"+
                    "4. Years\n");
            choice = FuramaController.choiceException(choice);
            switch (choice) {
                case 1:
                    rentalType = "Hours";
                    break;
                case 2:
                    rentalType = "Days";
                    break;
                case 3:
                    rentalType = "Months";
                    break;
                case 4:
                    rentalType = "Years";
                    break;
            }
            if(rentalType==null){
                System.out.println("Rental can't have type!");
            }
        }while (rentalType==null);
        System.out.println("Input free service included:");
        String freeServiceIncluded = scanner.nextLine();
        return new Room(id,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,freeServiceIncluded);
    }
    public House addHouse(){
        String id = null;
        id = Regex.getRegexFacilityId(id);
        String serviceName = null;
        serviceName = Regex.getRegexFacilityName(serviceName);
        int usableArea = 0;
        usableArea = Regex.getRegexArea(usableArea);
        int rentalCosts = 0;
        rentalCosts = Regex.getRegexRentalCosts(rentalCosts);
        int maximumNumberOfPeople = 0;
        maximumNumberOfPeople = Regex.getRegexMaximumNumberOfPeople(maximumNumberOfPeople);
        String rentalType = null;
        do {
            byte choice = 0;
            System.out.println("Input rental type\n" +
                    "1. Hours\n"+
                    "2. Days\n"+
                    "3. Moths\n"+
                    "4. Years\n");
            choice = FuramaController.choiceException(choice);
            switch (choice) {
                case 1:
                    rentalType = "Hours";
                    break;
                case 2:
                    rentalType = "Days";
                    break;
                case 3:
                    rentalType = "Months";
                    break;
                case 4:
                    rentalType = "Years";
                    break;
            }
            if(rentalType==null){
                System.out.println("Rental can't have type!");
            }
        }while (rentalType==null);
        String roomStandard = null;
        System.out.println("Input Room Standard:");
        roomStandard=Regex.getRegexFacilityName(roomStandard);
        int numberOfFloors=0;
        numberOfFloors=Regex.getRegexNumberOfFloors(numberOfFloors);
        return new House(id,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,numberOfFloors);
    }

    public Villa addVilla() {
        String id = null;
        id = Regex.getRegexFacilityId(id);
        String serviceName = null;
        System.out.println("Input name:");
        serviceName = Regex.getRegexFacilityName(serviceName);
        int usableArea = 0;
        usableArea = Regex.getRegexArea(usableArea);
        int rentalCosts = 0;
        rentalCosts = Regex.getRegexRentalCosts(rentalCosts);
        int maximumNumberOfPeople = 0;
        maximumNumberOfPeople = Regex.getRegexMaximumNumberOfPeople(maximumNumberOfPeople);
        String rentalType = null;
        do {
            byte choice = 0;
            System.out.println("Input rental type\n" +
                    "1. Hours\n"+
                    "2. Days\n"+
                    "3. Moths\n"+
                    "4. Years\n");
            choice = FuramaController.choiceException(choice);
            switch (choice) {
                case 1:
                    rentalType = "Hours";
                    break;
                case 2:
                    rentalType = "Days";
                    break;
                case 3:
                    rentalType = "Months";
                    break;
                case 4:
                    rentalType = "Years";
                    break;
            }
            if(rentalType==null){
                System.out.println("Rental can't have type!");
            }
        }while (rentalType==null);
        String roomStandard = null;
        System.out.println("Input Room Standard:");
        roomStandard=Regex.getRegexFacilityName(roomStandard);
        int poolArea =0;
        poolArea=Regex.getRegexArea(poolArea);
        int numberOfFloors=0;
        numberOfFloors=Regex.getRegexNumberOfFloors(numberOfFloors);
        return new Villa(id,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,poolArea,numberOfFloors);
    }

    @Override
    public void displayMaintenance() {
       List<Facility> facilities = facilityRepository.getAllMaintenance();
        for (Facility f: facilities
             ) {
            System.out.println(f);
        }
    }

    //serviceID,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,
}
