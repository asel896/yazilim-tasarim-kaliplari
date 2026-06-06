public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component); // Nesneyi üst sınıfa pasla
    }

    @Override
    public void operation() {
        super.operation(); // Önce var olan nesne işini yapsın
        addBehavior();     // Sonra yeni özelliği üstüne ekle (Süsle)
    }

    private void addBehavior() {
        System.out.print(" + Eklenmiş Özellik (Süslendi)");
    }
}