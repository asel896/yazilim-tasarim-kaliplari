public class MealDirector {

    private MealBuilder builder;

    public MealDirector(MealBuilder builder) {
        this.builder = builder;
    }

    public void constructMeal(){
        builder.buildBurger();
        builder.buildDrink();
        builder.buildToy();
    }

}
