
public class Main {
    public static void main(String[] args) {
        Context context = new Context(); // Yöneticiyi yarattık

        // Yöneticiye A stratejisini veriyoruz
        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy(); // Çıktı: A yöntemiyle iş yapılıyor.

        // B stratejisi
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy(); // Çıktı: B yöntemiyle iş yapılıyor.
    }
}