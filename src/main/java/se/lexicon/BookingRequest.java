package se.lexicon;

public class BookingRequest {
    private final int customerId;
    private final boolean member;
    private final String requestedTimeSlot;
    private final double basePrice;


    // Constructor
    public BookingRequest(int customerId, boolean member, String requestedTimeSlot, double basePrice) {
        this.customerId = customerId;
        this.member = member;
        this.requestedTimeSlot = requestedTimeSlot;
        this.basePrice = basePrice;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }
    public boolean isMember() {
        return member;
    }
    public String getRequestedTimeSlot() {
        return requestedTimeSlot;
    }
    public double getBasePrice() {
        return basePrice;
    }

}
