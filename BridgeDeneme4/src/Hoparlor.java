public interface Hoparlor {
    void sesVer();
}

class SonyHoparlor implements Hoparlor {
    @Override
    public void sesVer() {
        System.out.println("Sony bas sesleri veriyor.");
    }
}



class JblHoparlor implements Hoparlor {
    @Override
    public void sesVer() {
        System.out.println("JBL yüksek ses veriyor.");
    }
}