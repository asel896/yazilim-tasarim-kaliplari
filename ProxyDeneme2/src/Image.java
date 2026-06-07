public interface Image {
    void display();
}


class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // Nesne ilk kez üretildiğinde diskten yükleme simülasyonu
    }
    private void loadFromDisk() {
        System.out.println("Diskten Yükleniyor: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Fotoğraf Gösteriliyor: " + fileName);
    }
}


class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;     // Constructor'dan gelen ismi saklamak için şart!
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}