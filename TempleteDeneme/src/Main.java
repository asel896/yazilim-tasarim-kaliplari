public class Main {
    public static void main(String[] args) {
        System.out.println("MARIO BAŞLIYOR");

        NetworkGame mario = new MarioGame();
        mario.play(); // Şablon metodu tetikliyoruz

        System.out.println("SATRANÇ BAŞLIYOR");
        NetworkGame satranc = new ChessGame();

        satranc.play(); // Aynı şablon, farklı alt adımlar
    }
}