class AlisverisSepeti {
    private OdemeStratejisi strateji;  // secilen strateji

    public void setStrateji(OdemeStratejisi yeniStrateji) {
        this.strateji = yeniStrateji;
    }

    public void odemeYap(double tutar){
        strateji.ode(tutar); // isi kendi yapmayip secilen stratejiye devrediyor
    }
}
