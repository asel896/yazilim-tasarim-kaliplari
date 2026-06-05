public class Main {
    public static void main(String[] args) {
        Circle anaCircle=new Circle(2,"mavi");

        anaCircle.sekilBilgisi();

        Circle kopyaCircle=(Circle) anaCircle.clone();

        kopyaCircle.sekilBilgisi();
    }
    }