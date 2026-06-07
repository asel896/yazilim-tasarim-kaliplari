public class Main {
    public static void main(String[] args) {

        Interface core = new CoreFunctionality();


        Interface egikMetin = new OptionalOne(core);


        Interface kalinVeEgikMetin = new OptionalOne(egikMetin);


        String sonuc = kalinVeEgikMetin.doThis("Merhaba");
        System.out.println(sonuc);
    }
}