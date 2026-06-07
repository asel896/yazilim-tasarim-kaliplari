// interface
public interface Message {
    String getContent();
}

class PlainMessage implements Message {
    private String text;
    @Override
    public String getContent() {
        return "plain message";
    }
}
