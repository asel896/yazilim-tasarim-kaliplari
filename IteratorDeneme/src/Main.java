public class Main {
    public static void main(String[] args) {
        Aggregate koleksiyon = new ConcreteAggregate();

        // Koleksiyonun iç yapısını (String dizisi) hiç bilmeden sadece Iterator ile geziyoruz
        Iterator gezgin = koleksiyon.createIterator();

        System.out.println("--- Iterator İle Elemanlar Geziliyor ---");
        while (gezgin.hasNext()) {
            System.out.println(gezgin.next());
        }
    }
}