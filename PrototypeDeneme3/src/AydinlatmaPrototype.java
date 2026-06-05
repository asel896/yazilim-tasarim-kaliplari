public interface AydinlatmaPrototype {
    AydinlatmaPrototype clone();
}

class SmartBulb implements AydinlatmaPrototype {
    private int parlaklik;
    private String isikRengi;

    public SmartBulb(int parlaklik, String isikRengi) {
        this.parlaklik = parlaklik;
        this.isikRengi = isikRengi;
    }

    @Override
    public AydinlatmaPrototype clone() {
        return new SmartBulb(this.parlaklik, this.isikRengi);
    }

    public void ampulBilgisi(){
        System.out.println("parlaklik: " + parlaklik+ " isikRengi: " + isikRengi);
    }
}
