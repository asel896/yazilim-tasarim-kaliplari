public interface Iterator {
    boolean hasNext();
    String next();
}


class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int position = 0; // Hangi elemanda kaldığını hafızada tutuyor

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        // Dizinin boyutunu aşmadık mı kontrolü
        return position < aggregate.getItems().length;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            String item = aggregate.getItems()[position];
            position++; // Bir sonraki adıma geç
            return item;
        }
        return null;
    }
}