public interface SmartHomeBuilder {
    void buildLighting();
    void buildSecurity();
    void buildClimate();
    SmartHome getSmartHome();
}

class LuxuryHomeBuilder implements SmartHomeBuilder {
    SmartHome smartHome=new SmartHome();

    @Override
    public void buildLighting() {
        smartHome.lighting="Ses Kontrollü LED Aydınlatma";
    }
    @Override
    public void buildSecurity() {
        smartHome.security="Yüz Tanımalı Alarm Sistemi";
    }
    @Override
    public void buildClimate() {
        smartHome.climate="Merkezi Akıllı İklimlendirme";
    }
    @Override
    public SmartHome getSmartHome() {
        return smartHome;
    }
}