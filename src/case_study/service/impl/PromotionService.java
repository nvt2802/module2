package case_study.service.impl;

import case_study.model.person_model.Customer;
import case_study.repository.IPromotionRepository;
import case_study.repository.impl.PromotionRepository;
import case_study.service.IPromotionService;
import ss13_sort_algorithm.exercise.insertion_sort.Str;

import java.time.Year;
import java.util.List;
import java.util.Scanner;

public class PromotionService implements IPromotionService {
    private static final IPromotionRepository promotionRepository = new PromotionRepository();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayListCustomerUseService() {
        System.out.println("Input year customer used service:");
        String year = scanner.nextLine();
        List<Customer> customerList = promotionRepository.getCustomerUseServiceByYear(year);
        if (customerList.isEmpty()) {
            System.out.println("Can't find customer use service in this year!");
        } else {
            for (Customer c : customerList
            ) {
                System.out.println(c);
            }
        }
    }

    @Override
    public void displayListCustomerGetVoucher() {
        List<Customer> customerList = promotionRepository.displayListCustomerGetVoucher();
        int discountVoucher10;
        int discountVoucher20;
        int discountVoucher50;
        do {
            System.out.println("Enter the amount of 10% discount voucher:");
            discountVoucher10 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the amount of 20% discount voucher:");
            discountVoucher20 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the amount of 50% discount voucher:");
            discountVoucher50 = Integer.parseInt(scanner.nextLine());
            if (!(discountVoucher50 + discountVoucher10 + discountVoucher20 == customerList.size())) {
                System.out.println("Voucher must equal Customers number!" + customerList.size());
            } else {
                break;
            }
        } while (true);
        String[] arrStrVoucher = getVoucher(discountVoucher10, discountVoucher20, discountVoucher50);
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i) + ", Voucher:" + arrStrVoucher[i]);
        }
    }

    private static String[] getVoucher(int voucher10, int voucher20, int voucher50) {
        String[] str = new String[voucher10 + voucher20 + voucher50];
        String strVoucher10 = "10%";
        String strVoucher20 = "20%";
        String strVoucher50 = "50%";
        for (int i = 0; i < voucher10; i++) {
            str[i] = strVoucher10;
        }
        for (int i = voucher10; i < voucher10 + voucher20; i++) {
            str[i] = strVoucher20;
        }
        for (int i = voucher10 + voucher20; i < voucher10 + voucher20 + voucher50; i++) {
            str[i] = strVoucher50;
        }
        return str;
    }

}
