package se.lexicon;

public abstract class Service {

    private final int id;
    private final String name;
    private  final double basePrice;

    // Constructor

    public Service(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }
}
