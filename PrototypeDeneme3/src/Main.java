public class Main {
    public static void main(String[] args) {
        SmartBulb anaAmpul=new SmartBulb(80,"sari");

        anaAmpul.ampulBilgisi();

        SmartBulb kopyaAmpul=(SmartBulb) anaAmpul.clone();

        kopyaAmpul.ampulBilgisi();


    }
    }