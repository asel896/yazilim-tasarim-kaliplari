public class Main {
    public static void main(String[] args) {

        // Fabrikaya sadece ne istediğimizi ve özelliklerini söylüyoruz:
        GameCharacter c1 = CharacterFactory.getCharacter("savasci", "Barbar", 85);
        GameCharacter c2 = CharacterFactory.getCharacter("buyucu", "Elementalist", 120);


        System.out.println("1. Oyuncu Seçimi -> " + c1);
        System.out.println("2. Oyuncu Seçimi -> " + c2);
    }
}