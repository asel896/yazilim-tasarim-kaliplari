// CLIENT (Main Sınıfı)

public class Main {
    public static void main(String[] args) {
        // Kırmızı bir Daire üretelim
        Sekil kirmiziDaire = new Daire(new Kirmizi());
        kirmiziDaire.ciz();

        // Mavi bir Kare üretelim
        Sekil maviKare = new Kare(new Mavi());
        maviKare.ciz();
    }
}