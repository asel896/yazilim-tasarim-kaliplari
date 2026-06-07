public class Main {
    public static void main(String[] args) {
        Report report=new ProxyReport("Yillik_Satis_Raporu.pdf");

        System.out.println("1. İstek (Veritabanından çekilmeli):");

        report.display();

        System.out.println("2. İstek (Veritabanına gitmemeli, hazır nesneyi kullanmalı):");
        report.display();
    }
}