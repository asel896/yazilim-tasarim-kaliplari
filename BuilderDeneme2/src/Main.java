public class Main {
    public static void main(String[] args) {

        KidsMealBuilder kidsMealBuilder = new KidsMealBuilder();

        MealDirector mealDirector = new MealDirector(kidsMealBuilder);

        mealDirector.constructMeal();

        Meal cocukMenusu=kidsMealBuilder.getResult();

        cocukMenusu.afiyetOlsun();
    }
}