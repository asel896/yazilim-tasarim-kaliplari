public class Logger {
    private static Logger instance;

    public String log="deneme";
    private Logger() {
        System.out.println("Loglama sistemi aktif edildi.");
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("[LOG] -> " + message);
    }
}
