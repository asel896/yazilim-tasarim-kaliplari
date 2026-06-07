public class Main {
    public static void main(String[] args) {
        Handler lider = new ConcreteHandler();
        Handler mudur = new ConcreteHandler2();

        // Lider çözemezse Müdüre aktarsın
        lider.setNext(mudur);

        System.out.println("--- 500 TLlik İstek ---");
        lider.handleRequest(500); // Doğrudan lider onaylayacak.

        System.out.println("\n--- 3500 TLlik İstek ---");
        lider.handleRequest(3500); // Lider müdüre paslayacak, müdür onaylayacak.
    }
    }
