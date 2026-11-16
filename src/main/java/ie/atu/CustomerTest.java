package ie.atu;

public class CustomerTest {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Nathan","123456","Gort",123456,true);
        System.out.println(firstCustomer);

        Customer secondCustomer = new Customer();
        secondCustomer.setName("Bob");
        secondCustomer.setPhoneNumber("75846322");
        secondCustomer.setAddress("Bobstreet");
        secondCustomer.setCustomerNumber(4567);
        secondCustomer.setMailingList(false);
        System.out.println("");
        System.out.println(secondCustomer);
    }
}