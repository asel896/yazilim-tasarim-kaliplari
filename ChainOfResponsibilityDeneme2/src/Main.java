public class Main {
    public static void main(String[] args) {
        Logger info = new InfoLogger();
        Logger warning = new WarningLogger();
        Logger error = new ErrorLogger();

        // treni kuruyoruz
        info.setNext(warning);
        warning.setNext(error);

        info.logMessage("WARNING", "Bellek kullanımı %80e ulaştı!");
        info.logMessage("INFO", "Sistem başarıyla başlatıldı.");

    }
}