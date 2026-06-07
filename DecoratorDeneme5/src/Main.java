public class Main {
    public static void main(String[] args) {
        Message message=new PlainMessage();

        message=new Base64Decorator(message);

        message=new ReverseDecorator(message);

        System.out.println("sifreli mesaj: " +message);
    }
}