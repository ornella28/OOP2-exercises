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

    // Getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double calculatePrice();

    public abstract int getDurationInMinutes();

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
