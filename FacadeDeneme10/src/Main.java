// ÇALIŞTIRICI
public class Main {
    public static void main(String[] args) {
        // Facade nesnesini yaratıyoruz (Parantezin içi boş, çünkü içeride new'leniyor)
        ShapeMaker shapeMaker = new ShapeMaker();

        // İstediğimiz şekli tek metotla çizdiriyoruz
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}