class Context {
    private Strategy strategy; // composition

    // Stratejiyi dinamik değiştiren metot
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute(); // İşi seçilen işçiye devretti (Delegation)
    }
}