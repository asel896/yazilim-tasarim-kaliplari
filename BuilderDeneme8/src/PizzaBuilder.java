public abstract class PizzaBuilder {

    protected Pizza pizza = new Pizza();

    public abstract Pizza BuildPizzaBase();
    public abstract Pizza BuildToppings();
    public Pizza GetPizza(){
        return pizza;
    }
}

// Peynirli Pizza Ustası
public class CheesePizzaBuilder extends PizzaBuilder {
    @Override
    public void BuildPizzaBase() {
        pizza.Add("Ince Kenar Hamur");
    }

    @Override
    public void BuildToppings() {
        pizza.Add("Bol Mozerella Peyniri");
        pizza.Add("Cheddar Peyniri");
    }
}

// Karışık Pizza Ustası
public class MixedPizzaBuilder extends PizzaBuilder {
    @Override
    public void BuildPizzaBase() {
        pizza.Add("Kalin Kenar Hamur");
    }

    @Override
    public void BuildToppings() {
        pizza.Add("Sucuk");
        pizza.Add("Salam");
        pizza.Add("Mantar");
        pizza.Add("Misir");
    }
}