// 1. IMPLEMENTOR (Renk Arayüzü)
public interface Renk {
    void renkUygula();
}

// Somut Renk 1
class Kirmizi implements Renk {
    @Override
    public void renkUygula() {
        System.out.print("Kırmızı renge boyandı.");
    }
}

// Somut Renk 2
class Mavi implements Renk {
    @Override
    public void renkUygula() {
        System.out.print("Mavi renge boyandı.");
    }
}