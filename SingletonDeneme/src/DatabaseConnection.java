public class DatabaseConnection {

    // Kendi türünden tek nesneyi static ve private olarak tutuyoruz
    private static DatabaseConnection instance;

    // içeride test verisi tutalım
    private String connectionString;

    // CONSTRUCTOR GİZLİ (PRIVATE) Dışarıdan new ile çağrılamaz
    private DatabaseConnection() {
        this.connectionString = "jdbc:mysql://localhost:3306/my_db";
        System.out.println("Veritabanına güvenli bağlantı kuruldu.");
    }

    // Dış dünyaya açılan tek kapı (Giriş Noktası)
    public static DatabaseConnection getInstance() {
        // Eğer daha önce hiç nesne üretilmediyse (yani null ise)
        if (instance == null) {
            // o zaman ilk ve son kez nesneyi üretiyoruz
            instance = new DatabaseConnection();
        }
        // Zaten üretilmişse, hafızadaki mevcut nesneyi aynen geri döndürüyoruz
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println(connectionString + " adresi üzerinden sorgu çalıştırıldı: " + sql);
    }
}