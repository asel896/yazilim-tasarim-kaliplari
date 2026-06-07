public interface Interface {
    String doThis(String text);
}

class CoreFunctionality implements Interface {
    @Override
    public String doThis(String text) {
        return text;
    }
}

