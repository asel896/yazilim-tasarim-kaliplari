public class Main {
    public static void main(String[] args) {
        AbstractFactory fabrika=new ModernFurnitureFactory();

        Chair sandalye = fabrika.createChair();

        Sofa koltuk = fabrika.createSofa();

        sandalye.sitOn();
        koltuk.lieOn();
    }
}