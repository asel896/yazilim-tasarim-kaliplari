public class Main {
    public static void main(String[] args) {
        Image foto=new ProxyImage("a.jpg");

        System.out.println("1. Tıklama (İlk kez yükleniyor):");
        foto.display();

        System.out.println("2. Tıklama (Diskten yüklenmemeli, hafızadan gelmeli):");
        foto.display();
    }
}