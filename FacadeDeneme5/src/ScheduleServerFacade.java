// FACADE CEPHE SINIFI
class ScheduleServerFacade {
    private final ScheduleServer scheduleServer; // // İşleri yapacak olan nesneyi burada tutuyoruz.

    // dışarıdan nesne alan Constructor
    public ScheduleServerFacade(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    // Başlatma Kombinasyonu
    public void startServer() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
    }

    // Durdurma Kombinasyonu
    public void stopServer() {
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}