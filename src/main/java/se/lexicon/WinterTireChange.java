package se.lexicon;

public class WinterTireChange extends Service {

    private static final int storageFee = 300;

    public WinterTireChange(int id, String name, int basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public int getDurationInMinutes() {
        return 45;
    }

    @Override
    public int calculatePrice() {
        return getBasePrice() + storageFee; // 20% increase for winter
    }

}
