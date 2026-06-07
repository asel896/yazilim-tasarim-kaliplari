public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+ " + Bol Peynir";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice() + 30.0;
    }
}

class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+ " + Siyah Zeytin";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice() + 20.0;
    }
}
