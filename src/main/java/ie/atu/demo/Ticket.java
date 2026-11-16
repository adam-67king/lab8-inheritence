package ie.atu;

public class Ticket {
    private String summerConcert;
    private String holderName;
    private String basePrice;

    public String getSummerConcert() {
        return summerConcert;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public Ticket(String summerConcert, String holderName, String basePrice) {
        this.summerConcert = summerConcert;
        this.holderName = holderName;
        this.basePrice = basePrice;


    }
}
