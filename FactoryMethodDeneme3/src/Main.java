public class Main {
    public static void main(String[] args) {
        LoggerFactory factory;

        // Senaryo 1: konsola yazmak istedik
        factory = new ConsoleLoggerFactory(); // Soyut sınıftan değil, SOMUT fabrikadan new dedik
        factory.logMessage("Sistem başlatıldı.");
        // Çıktı: Konsola yazıldı: Sistem başlatıldı.

        // Senaryo 2: dosyaya yazmak istedik
        factory = new FileLoggerFactory();
        factory.logMessage("Kritik hata loglandı.");
        // Çıktı: Dosyaya yazıldı: Kritik hata loglandı.
    }
}