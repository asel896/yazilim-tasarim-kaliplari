public class Main {
    public static void main(String[] args) {

        AdvancedLogger logger = new AdvancedLogger();

        LoggerAdapter loggerAdapter = new LoggerAdapter(logger);

        loggerAdapter.log("message");
    }
}