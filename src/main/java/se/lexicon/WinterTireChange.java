package se.lexicon;

public class WinterTireChange extends Service {

    public WinterTireChange(int id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public int getDurationInMinutes() {
        return 45;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.2; // 20% increase for winter
    }

}
