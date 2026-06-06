public abstract class CoffeeDecorator {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }


    public void make(){
        decoratedCoffee.make();
    }
}

class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public void make(){
        decoratedCoffee.make();
        System.out.println("sut kopugu");
    }
}