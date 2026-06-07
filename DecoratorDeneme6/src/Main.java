public class Main {
    public static void main(String[] args) {
        Pizza pizza=new PlainPizza();

        pizza=new CheeseDecorator(pizza);

        pizza=new OliveDecorator(pizza);

        System.out.println("siparis: " + pizza.getDescription());
        System.out.println("toplam: " + pizza.getPrice());

    }
}