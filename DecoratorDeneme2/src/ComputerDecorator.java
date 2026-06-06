// decorator
public abstract class ComputerDecorator implements Computer{
    protected Computer decoratedComputer;

    public ComputerDecorator(Computer computer) {
        this.decoratedComputer = computer;
    }
    @Override
    public String getDescription() {
        return decoratedComputer.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedComputer.getPrice();
    }
}

// concreteDecorator
class RamDecorator extends ComputerDecorator {
    public RamDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 16GB RAM";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2000.0;
    }
}

class GpuDecorator extends ComputerDecorator {
    public GpuDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + RTX Ekran Kartı";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5000.0;
    }
}