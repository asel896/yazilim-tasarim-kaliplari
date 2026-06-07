// abstract factory
public interface AbstractFactory {
    // dönüş tipleri somut sınıf değil, hep interface (AbstractProduct) olur
    AbstractProduct createProductA();
    AbstractProduct createProductB();
}

class ConcreteFactory implements AbstractFactory {
    @Override
    public AbstractProduct createProductA() {
        // istenen somut urunu new'leyip soyut arayuz tipinde donduruyoruz
        return new ConcreteProduct();
    }
    @Override
    public AbstractProduct createProductB() {
        return new ConcreteProduct();
    }
}