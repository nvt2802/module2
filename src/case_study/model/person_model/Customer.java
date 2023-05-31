package case_study.model.person_model;

public class Customer extends Person{
    private String customerLevel;
    private String address;

    public Customer() {
    }

    public Customer(String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String customerLevel, String address) {
        super(ID, name, dayOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.customerLevel = customerLevel;
        this.address = address;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                ", customerLevel='" + customerLevel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
