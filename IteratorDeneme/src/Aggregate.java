public interface Aggregate {
    Iterator createIterator();
}

class ConcreteAggregate implements Aggregate {
    private String[] items={"Eleman 1", "Eleman 2", "Eleman 3"};

    public String[] getItems() {
        return items;
    }
    @Override
    public Iterator createIterator() {
        // Kendisi üzerinde gezinecek olan özel yardımcıyı üretiyor
        return new ConcreteIterator(this);
    }
}
