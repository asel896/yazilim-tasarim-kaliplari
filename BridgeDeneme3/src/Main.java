public class Main {
    public static void main(String[] args) {
        Rapor rapor1 = new HaftalikRapor(new OracleDb());
        rapor1.raporuGoster();

        System.out.println("------------------------------------");

        
        Rapor rapor2 = new HaftalikRapor(new MysqlDb());
        rapor2.raporuGoster();
    }
}