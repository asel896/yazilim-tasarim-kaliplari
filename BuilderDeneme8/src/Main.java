public class Main {
    public static void main(String[] args) {
        // Yöneticiyi (Garsonu) çağırıyoruz
        Waiter garson = new Waiter();

        // Müşteri Peynirli Pizza istedi -> Peynir ustasını garsona veriyoruz
        PizzaBuilder peynirliUsta = new CheesePizzaBuilder();
        garson.setPizzaBuilder(peynirliUsta);

        // Garson süreci yönetiyor
        garson.Serve();

        // Pizzayı ustadan teslim alıp teslim ediyoruz
        Pizza peynirliPizza = peynirliUsta.GetPizza();
        peynirliPizza.Deliver();

        System.out.println("--------------------------------------");

        // Müşteri Karışık Pizza istedi -> Karışık ustasını garsona veriyoruz
        PizzaBuilder karisikUsta = new MixedPizzaBuilder();
        garson.setPizzaBuilder(karisikUsta);

        // Garson süreci yönetiyor
        garson.Serve();

        // Pizzayı ustadan teslim alıp teslim ediyoruz
        Pizza karisikPizza = karisikUsta.GetPizza();
        karisikPizza.Deliver();
    }
}