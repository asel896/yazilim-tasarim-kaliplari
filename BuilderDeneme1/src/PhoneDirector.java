public class PhoneDirector {
    private PhoneBuilder builder;

    public PhoneDirector(PhoneBuilder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildOS();
        builder.buildProcessor();
        builder.buildBattery();
    }
}
