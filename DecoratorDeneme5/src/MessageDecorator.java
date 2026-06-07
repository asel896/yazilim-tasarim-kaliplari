public abstract class MessageDecorator implements Message{
    protected Message message;

    public MessageDecorator(Message message){
        this.message = message;
    }
    @Override
    public String getContent() {
        return message.getContent();
    }
}

class Base64Decorator extends MessageDecorator{
    public Base64Decorator(Message message){
        super(message);
    }
    @Override
    public String getContent() {
        return "Base64["+ message.getContent()+"]";
    }
}

class ReverseDecorator extends MessageDecorator{
    public ReverseDecorator(Message message){
        super(message);
    }
    @Override
    public String getContent() {
        return "Reverse["+ message.getContent()+"]";
    }
}