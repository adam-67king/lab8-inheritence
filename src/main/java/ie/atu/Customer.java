package ie.atu;

public class Customer extends Person
{
    private int customerNumber;
    private boolean mailingList;

    public Customer(int customerNumber, boolean mailingList) {
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public Customer() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }
}
