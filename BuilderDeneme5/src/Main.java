public class Main {
    public static void main(String[] args) {
        LuxuryHomeBuilder builder = new LuxuryHomeBuilder();

        Technician technician=new Technician(builder);

        technician.construct();

        SmartHome yeni=builder.getSmartHome();

        yeni.homeInfo();
    }
}