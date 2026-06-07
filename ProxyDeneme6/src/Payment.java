public interface Payment {
    void amount(double amount);
}

class FundsPaidFromAccount implements Payment {
    @Override
    public void amount(double amount) {
        System.out.println("RealSubject: Hesap açıldı, 1.000.000 Dolar nakit olarak ödendi!");
    }
}

class CheckProxy implements Payment {
    private FundsPaidFromAccount realAccount;

    @Override
    public void amount(double amount) {
        System.out.println("Proxy: Çek ibraz edildi, imza ve bakiye kontrol ediliyor... ");
        if(realAccount==null){
            realAccount=new FundsPaidFromAccount();
        }
        realAccount.amount(amount);
    }
}