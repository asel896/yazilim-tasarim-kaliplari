public class Main {
    public static void main(String[] args) {
        KaranlikTema anaKaranlikTema=new KaranlikTema("karanlik","siyah",24);

        anaKaranlikTema.temaBilgisi();

        KaranlikTema kopyaKaranlikTema=(KaranlikTema) anaKaranlikTema.clone();

        kopyaKaranlikTema.temaBilgisi();
    }
}