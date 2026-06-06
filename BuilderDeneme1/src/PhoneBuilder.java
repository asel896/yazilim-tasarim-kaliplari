public interface PhoneBuilder {
    void buildOS();
    void buildProcessor();
    void buildBattery();
    Phone getResult();
}

class IPhoneBuilder implements PhoneBuilder {
    Phone phone=new Phone();
    public void buildOS() {
        phone.os = "iOS";
    }
    public void buildProcessor() {
        phone.processor = "iOS 18";
    }
    public void buildBattery() {
        phone.battery = "3200 mAh";
    }
    public Phone getResult() {
        return phone;
    }
}