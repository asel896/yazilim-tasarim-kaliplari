// ISTEMCI
public class Main {
    public static void main(String[] args) {
        YakitPompasi yakitPompasi = new YakitPompasi();
        AteslemeSistemi ateslemeSistemi = new AteslemeSistemi();
        MarsMotoru marsMotoru = new MarsMotoru();

        TestFacade test =new TestFacade(yakitPompasi, ateslemeSistemi, marsMotoru);
        test.arabayiCalistir();


    }
}