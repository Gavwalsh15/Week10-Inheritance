package ie.atu.week10;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;

    public Customer() {
    }

    public Customer(String name, String address, String telephone, String customerNumber, boolean mailingList) {
        super(name, address, telephone);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
