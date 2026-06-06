public interface Coffee {
    void make();
}

class SimpleCoffe implements Coffee {
    @Override
    public void make() {
        System.out.println("Sade kahve");
    }
}
