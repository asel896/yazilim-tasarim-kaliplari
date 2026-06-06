// adapter
public interface AppLogger {
    void log(String text);
}

// concrete adapter

class LoggerAdapter implements AppLogger {
    private AdvancedLogger logger;
    public LoggerAdapter(AdvancedLogger logger) {
        this.logger = logger;
    }
    @Override
    public void log(String text) {
        logger.logToCloud(text);
    }
}


