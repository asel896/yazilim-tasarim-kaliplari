public interface BankaAltyapisi {
    void bankadanCek(double tutar);
}

class GarantiBankasi implements BankaAltyapisi {
    @Override
    public void bankadanCek(double tutar) {
        System.out.println("Garanti Bankası üzerinden $" + tutar + " çekildi.");
    }
}


class Akbank implements BankaAltyapisi {
    @Override
    public void bankadanCek(double tutar) {
        System.out.println("Akbank üzerinden $" + tutar + " çekildi.");
    }
}