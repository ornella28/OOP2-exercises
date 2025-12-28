package se.lexicon;

public class NonMemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {

        int finalPrice = request.getService().calculatePrice();

        return new Booking(request.getService(), finalPrice, false);
    }


}
