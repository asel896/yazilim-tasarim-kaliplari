// ÜST SINIF / ARAYÜZ
abstract class Cell {
    public abstract Cell split();
}

// SOMUT SINIF
class SingleCellOrganism extends Cell {
    private String organizmaAdi;
    private int dnaSifresi;

    // Constructor
    public SingleCellOrganism(String organizmaAdi, int dnaSifresi) {
        this.organizmaAdi = organizmaAdi;
        this.dnaSifresi = dnaSifresi;
    }


    @Override
    public Cell split() {
        return new SingleCellOrganism(this.organizmaAdi, this.dnaSifresi);
    }

    public void hucreBilgisi() {
        System.out.println("Hücre Türü: " + organizmaAdi + " | DNA Kodu: " + dnaSifresi);
    }
}


