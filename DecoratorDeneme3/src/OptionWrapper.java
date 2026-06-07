public abstract class OptionWrapper implements Interface {
    protected Interface wrappee;

    public OptionWrapper(Interface operationalInterface) {
        this.wrappee = wrappee;
    }

    @Override
    public String doThis(String text) {
        return wrappee.doThis(text);
    }
}


class OptionalOne extends OptionWrapper {
    public OptionalOne(Interface wrappee) {
        super(wrappee);
    }

    @Override
    public String doThis(String text) {
        return "<b>" + super.doThis(text) + "</b>";
    }
}