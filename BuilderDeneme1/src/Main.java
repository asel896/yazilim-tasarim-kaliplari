public class Main {
    public static void main(String[] args) {
        IPhoneBuilder usta = new IPhoneBuilder();

        PhoneDirector müdür = new PhoneDirector(usta);

        müdür.construct();

        Phone yeniTelefon = usta.getResult();

        yeniTelefon.info();
    }
}