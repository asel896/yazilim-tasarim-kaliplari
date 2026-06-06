public interface Builder {
    void olustur(String hamMetin);
    Urun getResult(); // Bitmiş ürünü teslim almak için şart
}

class PdfBuilder implements Builder {
    private Urun urun = new Urun();

    @Override
    public void olustur(String hamMetin) {
        // Metni PDF formatına uygun şekilde sarmalıyoruz
        urun.setIcerik("[PDF FORMATI] -> " + hamMetin + " <- [PDF_END]");
    }

    @Override
    public Urun getResult() {
        return urun;
    }
}