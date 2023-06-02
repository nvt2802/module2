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

import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {

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
                facilityRepository.addVilla(villa);
                break;
            case 2:
                //House(serviceID,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,numberOfFloors)
                House house = addHouse();
                facilityRepository.addHouse(house);
                break;
            case 3:
                //Room(serviceID,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,freeServiceIncluded)
                Room room = addRoom();
                facilityRepository.addRoom(room);
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
        System.out.println("Input number of floors");
        int numberOfFloors=Integer.parseInt(scanner.nextLine());
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
        int numberOfFloors=Integer.parseInt(scanner.nextLine());
        return new Villa(id,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,poolArea,numberOfFloors);
    }

    //serviceID,serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,
}
