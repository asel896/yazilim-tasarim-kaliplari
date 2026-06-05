public class Main {
    public static void main(String[] args) {
        // İstemci asla 'new PC()' veya 'new Server()' yazmıyor
        // Fabrikaya sadece ne istediğini söylüyor.

        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        System.out.println("Fabrikadan Çıkan PC Tasarımı: " + pc);
        System.out.println("Fabrikadan Çıkan Server Tasarımı: " + server);
    }
}