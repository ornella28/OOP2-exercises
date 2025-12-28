package se.lexicon;

public class Booking {

    private final Service service;
    private final int finalPrice;
    private final boolean priorityAccess;

    // Constructor


    public Booking(Service service, int price, boolean priorityAccess) {
        this.service = service;
        this.finalPrice = price;
        this.priorityAccess = priorityAccess;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "service=" + service +
                ", price=" + finalPrice +
                ", priorityAccess=" + priorityAccess +
                '}';
    }
}
