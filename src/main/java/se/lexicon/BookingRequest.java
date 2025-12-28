package se.lexicon;

public class BookingRequest {
    private final Service service;
    private final boolean member;

    // Constructor
    public BookingRequest(Service service, boolean member) {
        this.service = service;
        this.member = member;
    }

    // Getters
    public Service getService() {
        return service;
    }
    public boolean isMember() {
        return member;
    }

}
