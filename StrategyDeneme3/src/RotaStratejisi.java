interface RotaStratejisi {
    void rotaCiz();
}

class ArabaStratejisi implements RotaStratejisi {
    @Override
    public void rotaCiz() {
        System.out.println("Araba Stratejisi");
    }
}

class YuruyusStratejisi implements RotaStratejisi {
    @Override
    public void rotaCiz() {
        System.out.println("Yuruyus Stratejisi");
    }
}
