// FACADE CEPHE SINIFI (İçeride new'leme yapılan klasik yöntem)
class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    // Yapıcı Metot (Nesneler içeride kendi kendine üretiliyor)
    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}

