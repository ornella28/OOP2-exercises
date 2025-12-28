package se.lexicon;


import java.util.ArrayList;
import java.util.List;

public class Main {


     void main() {

         List<Service> services = new ArrayList<>();
         services.add(new SummerTireChange(1, "Summer Tire Change", 500));
            services.add(new WinterTireChange(2, "Winter Tire Change", 600));

            for (Service service : services){
                System.out.println(service.getName() + " costs " + service.calculatePrice());
            }

        Service service = new SummerTireChange(1, "Summer Tire Change", 500);
        BookingRequest request = new BookingRequest(service, true);

        BookingProcessor processor = new MemberBookingProcessor();
        Booking booking = processor.processBooking(request);
        System.out.println("Booking Details:" + booking);







    }

}
