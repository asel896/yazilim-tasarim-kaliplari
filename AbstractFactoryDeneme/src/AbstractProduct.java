// abstract product
public interface AbstractProduct {
    void display();
}

// concrete product
class ConcreteProduct implements AbstractProduct{
    @Override
    public void display() {
        System.out.println("Somut Ürün başarıyla oluşturuldu ve çalışıyor!");
    }
}