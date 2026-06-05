class Savasci {
    private SaldiriStratejisi strateji;

    public void setStrategy(SaldiriStratejisi yeniStrateji) {
        this.strateji= yeniStrateji;
    }

    public void vur(){
        strateji.saldir();
    }
}
