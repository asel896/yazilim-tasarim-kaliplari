public interface TemaPrototype {
    TemaPrototype clone();
}

class KaranlikTema implements TemaPrototype {
    private String temaAdi;
    private String arkaPlanRengi;
    private int yaziBoyutu;

    public KaranlikTema(String temaAdi, String arkaPlanRengi, int yaziBoyutu) {
        this.temaAdi = temaAdi;
        this.arkaPlanRengi = arkaPlanRengi;
        this.yaziBoyutu = yaziBoyutu;
    }

    @Override
    public TemaPrototype clone() {
        return new KaranlikTema(this.temaAdi, this.arkaPlanRengi, this.yaziBoyutu);
    }
    public void temaBilgisi(){
        System.out.println("tema adi:"+ temaAdi + "arka plan rengi:" + arkaPlanRengi + "yazi boyutu:" + yaziBoyutu);
    }
}