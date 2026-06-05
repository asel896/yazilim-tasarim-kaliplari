// PROTOTYPE ARAYUZU
public interface Prototype {
    Prototype clone(); // kendini kopyalayip geri dondurecek metot
}

// SOMUT PROTOTYPE
class ConcretePrototype1 implements Prototype {
    private String ozellik;

    public ConcretePrototype1(String ozellik) {
        this.ozellik = ozellik;
    }

    // klonlama
    @Override
    public Prototype clone() {
        // kendi icindeki verilerle yeni bir kopya olusturur
        return new ConcretePrototype1(ozellik);
    }

    public void bilgiVer(){
        System.out.println("ConcretePrototype1 özellikleri: " + ozellik);
    }
}

class ConcretePrototype2 implements Prototype {
    private int sayi;

    public ConcretePrototype2(int sayi) {
        this.sayi = sayi;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.sayi);
    }

    public void bilgiVer() {
        System.out.println("ConcretePrototype2 değeri: " + sayi);
    }
}
