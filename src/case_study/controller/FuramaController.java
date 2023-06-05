package case_study.controller;

import case_study.service.*;
import case_study.service.impl.*;
import sun.nio.cs.ext.IBM037;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IEmployeeService employeeService = new EmployeeService();
    private static final ICustomerService customerService = new CustomerService();
    private static final IFacilityService facilityService = new FacilityService();
    private static final IBookingService bookingService = new BookingService();
    private static final IContactService contactService = new ContactService();

    public static void displayMainMenu() {
        do {
        System.out.println("--------------------MENU-------------------");
        System.out.println("|          1. Employee Management         |");
        System.out.println("|          2. Customer Management         |");
        System.out.println("|          3. Facility Management         |");
        System.out.println("|          4. Booking Management          |");
        System.out.println("|          5. Promotion Management        |");
        System.out.println("|          6. Exit                        |");
        System.out.println("-------------------------------------------");
            System.out.println("Input number for choice: ");
        byte choice = 0;
        choice = choiceException(choice);
            switch (choice) {
                case 1:
                    System.out.println("1. Display list employees\n" +
                            "2. Add new employee\n" +
                            "3. Edit employee\n" +
                            "4. Delete employee\n" +
                            "5. Search employee\n" +
                            "6. Return main menu\n"
                    );
                    choice = choiceException(choice);
                    switch (choice) {
                        case 1:
                            employeeService.display();
                            break;
                        case 2:
                            employeeService.add();
                            break;
                        case 3:
                            employeeService.edit();
                            break;
                        case 4:
                            employeeService.delete();
                            break;
                        case 5:
                            employeeService.search();
                            break;
                        case 6:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tDelete customer\n" +
                            "5.\tSearch by name customer\n" +
                            "6.\tReturn main menu\n");
                    choice = choiceException(choice);
                    switch (choice) {
                        case 1:
                            customerService.display();
                            break;
                        case 2:
                            customerService.add();
                            break;
                        case 3:
                            customerService.edit();
                            break;
                        case 4:
                            customerService.delete();
                            break;
                        case 5:
                            customerService.search();
                            break;
                        case 6:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Display list facility\n" +
                            "2. Add new facility\n" +
                            "3. Display list facility maintenance\n" +
                            "4. Delete facility\n" +
                            "5. Return main menu\n");
                    choice = choiceException(choice);
                    switch (choice) {
                        case 1:
                            facilityService.display();
                            break;
                        case 2:
                            facilityService.add();
                            break;
                        case 3:
                            facilityService.displayMaintenance();
                            break;
                        case 4:
                            facilityService.delete();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1. Add new booking\n" +
                            "2. Display list booking\n" +
                            "3. Create new contracts\n" +
                            "4. Display list contracts\n" +
                            "5. Edit contracts\n" +
                            "6. Return main menu\n");
                    choice = choiceException(choice);
                    switch (choice) {
                        case 1:
                            bookingService.add();
                            break;
                        case 2:
                            bookingService.display();
                            break;
                        case 3:
                            contactService.add();
                            break;
                        case 4:
                            contactService.display();
                            break;
                        case 5:
                            contactService.edit();
                            break;
                        case 6:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1. Display list customers use service\n" +
                            "2. Display list customers get voucher\n" +
                            "3. Return main menu\n");
                    choice = choiceException(choice);
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 6:
                    System.exit(1);
            }
        }while (true);
    }

    public static byte choiceException(byte choice) {
        do {
            try {
                choice = Byte.parseByte(scanner.nextLine());
                break;
            } catch (NumberFormatException n) {
                System.out.println("Choice isn't number! Input number:");
            }
        } while (true);
        return choice;
    }
}
