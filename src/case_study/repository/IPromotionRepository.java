package case_study.repository;

import case_study.model.person_model.Customer;

import java.util.List;

public interface IPromotionRepository{
    List<Customer> getCustomerUseServiceByYear(String year);

    List<Customer> displayListCustomerGetVoucher();
}
