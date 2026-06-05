interface OdemeStratejisi {
    void ode(double tutar);
}

class KrediKartiStratejisi implements OdemeStratejisi {
    @Override
    public void ode(double tutar) {
        System.out.println(tutar + " TL kredi kartı ile ödendi.");
    }
}

class PaypalStratejisi implements OdemeStratejisi {
    @Override
    public void ode(double tutar) {
        System.out.println(tutar + " TL PayPal ile ödendi.");
    }
}