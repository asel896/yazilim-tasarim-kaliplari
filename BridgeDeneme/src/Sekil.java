// 2. ABSTRACTION (Şekil Sınıfı - KÖPRÜ)
public abstract class Sekil {
    // iki yapıyı birbirine bağlayan KÖPRÜ (Composition)
    protected Renk renk;

    // Constructor ile rengi içeri alıyoruz
    protected Sekil(Renk renk) {
        this.renk = renk;
    }

    public abstract void ciz();
}


// REFINED ABSTRACTION (Somut Şekiller)

class Daire extends Sekil {
    public Daire(Renk renk) {
        super(renk); // Rengi üst sınıftaki köprüye yolla
    }

    @Override
    public void ciz() {
        System.out.print("Daire çizildi ve ");
        renk.renkUygula(); // Köprü üzerinden rengi çağırıyoruz
        System.out.println();
    }
}

class Kare extends Sekil {
    public Kare(Renk renk) {
        super(renk);
    }

    @Override
    public void ciz() {
        System.out.print("Kare çizildi ve ");
        renk.renkUygula();
        System.out.println();
    }
}
