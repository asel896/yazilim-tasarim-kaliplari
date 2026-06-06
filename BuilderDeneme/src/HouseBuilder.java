// BUILDER ARAYUZU
public interface HouseBuilder {
    void buildBasement();
    void buildStructure();
    void buildRoof();
    House getResult(); // bitmiş evi teslim alma metodu
}

class WoodHouseBuilder implements HouseBuilder {
    private House house = new House(); // İçeride boş bir ev nesnesi tutar

    @Override
    public void buildBasement() {
        house.basement = "Ahşap Kazıklı Temel";
    }

    @Override
    public void buildStructure() {
        house.structure = "Ahşap Duvarlar";
    }

    @Override
    public void buildRoof() {
        house.roof = "Ondulin Çatı";
    }
    @Override
    public House getResult() {
        return this.house; // Bitmiş nesneyi döndürür
    }
}