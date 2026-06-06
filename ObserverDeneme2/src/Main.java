public class Main {
    public static void main(String[] args) {
        HavaDurumuIstasyonu havaDurumu = new HavaDurumuIstasyonu();

        Klima klima= new Klima();

        havaDurumu.ekle(klima);

        havaDurumu.setSicaklik(28);
    }

    }