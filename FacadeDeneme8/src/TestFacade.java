// FACADE CEPHE SINIFI
public class TestFacade {
    YakitPompasi yakitPompasi;
    AteslemeSistemi ateslemeSistemi;
    MarsMotoru marsMotoru;

    public TestFacade(YakitPompasi gelenYakitPompasi,AteslemeSistemi gelenAteslemeSistemi,MarsMotoru gelenMarsMotoru) {
        this.yakitPompasi = gelenYakitPompasi ;
        this.ateslemeSistemi = gelenAteslemeSistemi;
        this.marsMotoru = gelenMarsMotoru;
    }

    public void arabayiCalistir(){
        yakitPompasi.yakitGonder();
        ateslemeSistemi.atesle();
        marsMotoru.mars();
    }
}
