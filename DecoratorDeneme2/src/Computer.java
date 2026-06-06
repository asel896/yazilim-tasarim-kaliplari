// component
public interface Computer {
    String getDescription();
    double getPrice();
}

// concreteComponent
class BasicComputer implements Computer {
    @Override
    public String getDescription() {
        return "Temel Bilgisayar";
    }
    @Override
    public double getPrice() {
        return 10000.0;
    }
}
