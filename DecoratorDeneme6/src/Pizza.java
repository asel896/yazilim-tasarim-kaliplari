public interface Pizza {
    String getDescription();
    double getPrice();
}

class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Sade Pizza Tabani";
    }
    @Override
    public double getPrice() {
        return 150.0;
    }
}