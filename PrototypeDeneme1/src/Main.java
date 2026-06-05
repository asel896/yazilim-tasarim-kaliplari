public class Main {
    public static void main(String[] args) {
        // ana nesneleri 1 kez new'leyerek olusturduk
        Zombie anaZombie = new Zombie(100, "Zombie");
        Archer anaArcher = new Archer(80, "Okçu");

        System.out.println("Orijinal Canavarlar");
        anaZombie.canavarBilgisi();
        anaArcher.canavarBilgisi();


        Zombie kopyaZombie1 = (Zombie) anaZombie.clone();
        Zombie kopyaZombie2 = (Zombie) anaZombie.clone();
        Archer kopyaArcher1 = (Archer) anaArcher.clone();
        Archer kopyaArcher2 = (Archer) anaArcher.clone();


        kopyaZombie1.canavarBilgisi();
        kopyaZombie2.canavarBilgisi();
        kopyaArcher1.canavarBilgisi();
    }
}