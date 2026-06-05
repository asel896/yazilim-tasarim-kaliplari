// FACADE CEPHE MIMARISI
public class AkilliEvFacade {
    private Isik isik;
    private Klima klima;
    private Televizyon televizyon;

    public AkilliEvFacade() {
        this.isik = new Isik();
        this.klima = new Klima();
        this.televizyon = new Televizyon();
    }

    /*
    // CONSTRUCTOR: Nesneleri içeride new'lemiyor, DIŞARIDAN alıyor!
    public AkilliEvFacade(Isik gelenIsik, Klima gelenKlima, Televizyon gelenTv) {
        this.isik = gelenIsik;
        this.klima = gelenKlima;
        this.televizyon = gelenTv;
    }
     */

    public void sinemaModunuAc(){
        System.out.println("SINEMA MODU ACILIYOR");
        isik.isiklariKapat();
        klima.klimayiAc();
        televizyon.tvAc();
        System.out.println("SINEMA MODU ACILIYOR");
    }
}
