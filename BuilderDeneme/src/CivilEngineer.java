// DIRECTOR
class CivilEngineer {
    private HouseBuilder builder;

    // Director'a hangi ustayla (builder) çalışacağını söylüyoruz
    public CivilEngineer(HouseBuilder builder) {
        this.builder = builder;
    }

    // inşaatın sırasını yöneten algoritma
    public void construct() {
        builder.buildBasement();
        builder.buildStructure();
        builder.buildRoof();
    }
}


