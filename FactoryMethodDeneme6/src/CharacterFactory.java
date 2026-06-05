public class CharacterFactory {

    public static GameCharacter getCharacter(String type,String job, int damage) {
        // Eğer kullanıcı "savasci" girdiyse git Savasci nesnesi doğur
        if("savasci".equalsIgnoreCase(type)) {
            return new Savasci(job, damage);
        }
        // Eğer kullanıcı "buyucu" girdiyse git Buyucu nesnesi doğur
        else if("buyucu".equalsIgnoreCase(type)) {
            return new Buyucu(job, damage);
        }

        return null; // Tanımsız bir şey gelirse boş dön
    }
}


