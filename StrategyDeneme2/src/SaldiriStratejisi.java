interface SaldiriStratejisi {
    void saldir();
}

class KilicStratejisi implements SaldiriStratejisi {
    @Override
    public void saldir() {
        System.out.println("Kılıçla saldırdı: 50 hasar!");
    }
}

class OkStratejisi implements SaldiriStratejisi {
    @Override
    public void saldir() {
        System.out.println("Ok ve yayla saldırdı: 30 hasar!");
    }
}