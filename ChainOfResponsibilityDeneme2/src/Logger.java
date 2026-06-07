public interface Logger {
    void setNext(Logger nextLogger); // sonraki vagonu baglamak icin
    void logMessage(String level, String message);  // log seviyesini ve mesaji kontrol edip islemek icin
}

class InfoLogger implements Logger {
    private Logger next;

    @Override
    public void setNext(Logger nextLogger) {
        this.next = nextLogger;
    }

    @Override
    public void logMessage(String level, String message) {
        if (level.equals("INFO")) {
            System.out.println("INFO LOG: " + message);
        }else {
            if (next != null) {
                next.logMessage(level, message);
            }
        }
    }
}


class WarningLogger implements Logger{
    private Logger next;

    @Override
    public void setNext(Logger nextLogger) {
        this.next = nextLogger;
    }

    @Override
    public void logMessage(String level, String message) {
        if(level.equals("WARNING")){
            System.out.println("WARNING LOG: " + message);
        }else{
            if(next != null) {
                next.logMessage(level, message);
            }
        }
    }
}

class ErrorLogger implements Logger{
    private Logger next;

    @Override
    public void setNext(Logger nextLogger) {
        this.next = nextLogger;
    }
    @Override
    public void logMessage(String level, String message) {
        if (level.equals("ERROR")) {
            System.out.println("ERROR LOG: " + message);
        } else {
            System.out.println("Bilinmeyen Log Seviyesi: " + level);
        }
    }
}

