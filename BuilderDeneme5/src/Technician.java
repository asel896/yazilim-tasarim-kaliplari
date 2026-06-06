public class Technician {
    private SmartHomeBuilder smartHomeBuilder;

    public Technician(SmartHomeBuilder smartHomeBuilder) {
        this.smartHomeBuilder = smartHomeBuilder;
    }

    public void construct(){
        smartHomeBuilder.buildClimate();
        smartHomeBuilder.buildLighting();
        smartHomeBuilder.buildSecurity();
    }
}
