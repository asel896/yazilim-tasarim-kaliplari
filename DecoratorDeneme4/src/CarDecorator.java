// decorator
public abstract class CarDecorator implements Car {
    protected Car car;
    public CarDecorator(Car car){
        this.car = car;
    }
    @Override public String getInfo() {
        return car.getInfo();
    }
    @Override public int getSpeed() {
        return car.getSpeed();
    }
}

// concrete decorator
class RimsDecorator extends CarDecorator{
    public RimsDecorator(Car car){
        super(car);
    }
    @Override
    public String getInfo(){
        return car.getInfo()+ " + Çelik Jant";
    }
    @Override
    public int getSpeed(){
        return car.getSpeed()+10;
    }
}

class NitroDecorator extends CarDecorator{
    public NitroDecorator(Car car){
        super(car);
    }
    @Override
    public String getInfo(){
        return car.getInfo();
    }
    @Override
    public int getSpeed(){
        return car.getSpeed()+50;
    }
}