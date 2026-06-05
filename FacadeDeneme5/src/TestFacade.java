// İSTEMCİ
public class TestFacade {
    public static void main(String[] args) {
        // Alt sistem nesnesi dışarıda new'leniyor
        ScheduleServer scheduleServer = new ScheduleServer();

        // New'lenen nesne Facade'ın içine parametre olarak gönderiliyor
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);

        // Tek metotla bütün başlatma adımları tetikleniyor
        facadeServer.startServer();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        // Tek metotla bütün durdurma adımları tetikleniyor
        facadeServer.stopServer();
    }
}