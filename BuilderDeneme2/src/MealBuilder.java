public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    void buildToy();
    Meal getResult();
}


class KidsMealBuilder implements MealBuilder {
    Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.burger = "Tavuklu Burger";
    }

    @Override
    public void buildDrink() {
        meal.drink = "Ayran";
    }

    @Override
    public void buildToy() {
        meal.toy = "Araba";
    }

    @Override
    public Meal getResult() {
        return meal;
    }
}

