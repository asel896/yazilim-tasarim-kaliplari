interface Strategy {
    void execute(); // Kuralı koydu
}

class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("A yöntemiyle iş yapılıyor.");
    }
}

class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("B yöntemiyle iş yapılıyor.");
    }
}