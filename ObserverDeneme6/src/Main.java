public class Main {
    public static void main(String[] args) {
        Akvaryum akvaryum=new Akvaryum();
        AkilliSuPompasi akilliSuPompasi=new AkilliSuPompasi();

        akvaryum.takipciEkle(akilliSuPompasi);
        akvaryum.setSuSeviyesi(500);
    }
}