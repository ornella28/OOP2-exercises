package se.lexicon;

public abstract class Service {

    private final int id;
    private final String name;
    private  final int basePrice;

    // Constructor

    public Service(int id, String name, int basePrice) {
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

    public int getBasePrice() {
        return basePrice;
    }

    public abstract int calculatePrice();

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
