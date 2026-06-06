public class Main {
    public static void main(String[] args) {
        BenzinIstasyonu istasyon = new BenzinIstasyonu();

        Tabela devTabela = new Tabela();

        istasyon.aboneEkle(devTabela);

        istasyon.setBenzinFiyati(42.50);
        istasyon.setBenzinFiyati(41.90);
    }
    }