package se.lexicon;

public class SummerTireChange extends Service{

    private static final int discount = 200;

    public SummerTireChange(int id, String name, int basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public int getDurationInMinutes() {
        return 30;
    }

    @Override
    public int calculatePrice() {
        return getBasePrice() - discount;
    }


}
