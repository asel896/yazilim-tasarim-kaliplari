public abstract class LoggerFactory {
    public abstract Logger createLogger();

    public void logMessage(String message) {
        Logger logger = createLogger(); // Alt fabrikadan nesneyi iste
        logger.log(message);  // Gelen nesneyi kullan
    }

    class ConsoleLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println("Konsola yazıldı: " + message);
        }
    }

    class FileLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println("Dosyaya yazıldı: " + message);
        }
    }
}

// Konsol Logger üretecek gerçek fabrika
class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger(); // new kelimesini buraya hapsettik
    }
}

// Dosya Logger üretecek gerçek fabrika
class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger(); // new kelimesini buraya hapsettik
    }
}