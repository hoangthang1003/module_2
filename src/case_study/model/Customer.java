package case_study.model;

public class Customer extends Person{
    private String customerType;
    private String address;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String name, String dateOfBirth, String gender, String idCard, String phone, String email, String customerType, String address) {
        super(name, dateOfBirth, gender, idCard, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, idCard, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
