public interface AbstractFactory {
    Chair createChair();
    Sofa createSofa();
}

class ModernFurnitureFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class RetroFurnitureFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new RetroChair();
    }
    @Override
    public Sofa createSofa() {
        return new RetroSofa();
    }
}