public class Main {
    public static void main(String[] args) {
        String hamVeri = "Merhaba Dünya, bu bir deneme metnidir.";

        // PDF ustasını çağırıyoruz
        Builder pdfUsta = new PdfBuilder();

        // Ustayı yöneticiye teslim ediyoruz
        Yonetici yonetici = new Yonetici(pdfUsta);

        // Yönetici dönüştürme emrini veriyor
        yonetici.belgeyiDonustur(hamVeri);

        // Ustadan bitmiş PDF ürününü alıyoruz
        Urun sonBelge = pdfUsta.getResult();

        // Ekrana basıyoruz
        sonBelge.belgeyiGoster();
    }
}