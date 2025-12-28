package se.lexicon;

public class MemberBookingProcessor implements BookingProcessor{

    private final int memberDiscount = 100;

    @Override
    public Booking processBooking(BookingRequest request) {

        int basePrice = request.getService().calculatePrice();
        int finalPrice = basePrice - memberDiscount;

        return new Booking(request.getService(), finalPrice, true);
    }
}
