import javax.smartcardio.Card;

// Main içinde doğrudan kart üretmek (new ZiraatKart()) istemiyoruz. O yüzden kart basma işini bir fabrikaya devredeceğiz.
// once genel fabrika kuralini yaziyoruz
// 3. soyut fabrika
// Tüm kart basma fabrikalarının uyması gereken şablonu çizmek için.
abstract class CardFactory {
    // factory method:
    public abstract CreditCard createCard();

    // Kart üretildiği an bankamatik otomatik olarak ödemeyi tetiklesin diye:
    public void executePayment(){
        CreditCard card = createCard(); // // Kartı (nesneyi) alt fabrikadan istiyoruz.
        card.pay(); // Gelen kartı kullanıyoruz.
    }
}


class ZiraatFactory extends CardFactory {
    @Override
    public CreditCard createCard() {
        return new ZiraatKart(); // // 'new'i projenin geneli yerine buraya hapsettik
    }
}

class VakifbankFactory extends CardFactory {
    @Override
    public CreditCard createCard() {
        return new VakifbankKart(); // 'new' kelimesini buraya hapsettik!
    }
}