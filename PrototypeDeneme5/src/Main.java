// 3. İSTEMCİ / ÇALIŞTIRICI SINIF

public class Main {
    public static void main(String[] args) {
        // Ana hücreyi normal yolla oluşturuyoruz
        SingleCellOrganism anaHucre = new SingleCellOrganism("Amip", 998877);

        System.out.print("Ana Hücre -> ");
        anaHucre.hucreBilgisi();

        System.out.println("\n--- Hücre Bölünmesi (Prototype - split()) Başlıyor ---");

        
        SingleCellOrganism kopyaHucre = (SingleCellOrganism) anaHucre.split();

        System.out.print("Bölünen Yeni Hücre (Clone) -> ");
        kopyaHucre.hucreBilgisi();
    }
}