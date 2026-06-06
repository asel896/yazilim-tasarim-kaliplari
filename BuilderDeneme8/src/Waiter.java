public class Waiter {
    private PizzaBuilder pizzabldr;

    // Garsona hangi pizza ustasıyla çalışacağını söylüyoruz
    public void setPizzaBuilder(PizzaBuilder builder) {
        this.pizzabldr = builder;
    }

    public void Serve() {
        pizzabldr.BuildPizzaBase(); // Önce taban/hamur yapılır
        pizzabldr.BuildToppings();  // Sonra malzemeler eklenir
    }
}