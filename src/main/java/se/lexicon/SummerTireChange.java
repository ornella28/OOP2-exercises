package se.lexicon;

public class SummerTireChange extends Service{

    public SummerTireChange(int id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public int getDurationInMinutes() {
        return 30;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice(); // No increase for summer
    }


}
