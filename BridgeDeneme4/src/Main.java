public class Main {
    public static void main(String[] args) {
        System.out.println("SENARYO 1: Sony Hoparlörlü Radyo ");

        MuzikCalar radyo1 = new Radyo(new SonyHoparlor());
        radyo1.muzikCal();

        System.out.println("ENARYO 2: JBL Hoparlörlü Radyo");
        
        MuzikCalar radyo2 = new Radyo(new JblHoparlor());
        radyo2.muzikCal();
    }
}