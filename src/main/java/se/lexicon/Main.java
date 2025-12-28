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

         /*Service summerService = new SummerTireChange(1, "Summer Tire Change", 500);
         Service winterService = new WinterTireChange(2, "Winter Tire Change", 600);

            System.out.println(summerService);
            System.out.println("Duration: " + summerService.getDurationInMinutes() + " minutes");
            System.out.println("Price: $" + summerService.calculatePrice());
            System.out.println();
            System.out.println(winterService);
            System.out.println("Duration: " + winterService.getDurationInMinutes() + " minutes");
            System.out.println("Price: $" + winterService.calculatePrice());*/





    }

}
