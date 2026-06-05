public interface Veritabanı {
    void veriGetir();
}


class OracleDb implements Veritabanı{
    @Override
    public void veriGetir() {
        System.out.println("Oracle'dan veriler çekildi.");
    }
}


class MysqlDb implements Veritabanı{
    @Override
    public void veriGetir() {
        System.out.println("MySQL'den veriler çekildi.");
    }
}