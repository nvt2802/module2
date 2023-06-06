package case_study.service.impl;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.repository.IBookingRepository;
import case_study.repository.IContactRepository;
import case_study.repository.impl.BookingRepository;
import case_study.repository.impl.ContactRepository;
import case_study.service.IContactService;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
    private static Scanner scanner = new Scanner(System.in);
    private static IContactRepository contactRepository = new ContactRepository();
    private static IBookingRepository bookingRepository = new BookingRepository();

    @Override
    public void display() {
        List<Contract> contracts = contactRepository.getAll();
        for (Contract c : contracts
        ) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        String contractId;
        do {
            System.out.println("Input contract id:");
            contractId = scanner.nextLine();
        } while (Regex.getRegexContractId(contractId));
        String bookingId = null;
        Booking temp;
        if ((temp = contactRepository.getPollBooking()) != null) {
            bookingId = temp.getBookingID();
        } else {
            System.out.println("Booking list is empty");
            return;
        }
        System.out.println("Input advance deposit amount:");
        int depositAmount = Integer.parseInt(scanner.nextLine());
        System.out.println("Input total payment amount:");
        int paymentAmount = Integer.parseInt(scanner.nextLine());

        Contract contract = new Contract(contractId, bookingId, depositAmount, paymentAmount);
        contactRepository.add(contract);
    }

    @Override
    public void edit() {
        System.out.println("Input id contract:");
        String id = scanner.nextLine();
        int index = contactRepository.getIndexById(id);
        Contract contract = contactRepository.getByid(id);
        if (index == -1) {
            System.out.println("can't find this contract!");
        } else {
            int depositAmount;
            do {
                try {
                    System.out.println("Input advance deposit amount edit:");
                    depositAmount = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException n) {
                    System.out.println("Not a number");
                }
            } while (true);
            int paymentAmount;
            do {
                try {
                    System.out.println("Input total payment amount edit:");
                    paymentAmount = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException n) {
                    System.out.println("Not a number");
                }
            } while (true);

            Contract contractFind = new Contract(id, contract.getBookingID(), depositAmount, paymentAmount);
            contactRepository.edit(contractFind, index);
        }
    }
}
