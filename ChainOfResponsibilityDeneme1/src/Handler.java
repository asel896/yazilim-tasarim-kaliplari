public interface Handler {
    void setHandler(Handler nextHandler);
    void handleRequest(String issueType);
}

class DuzMemur implements Handler {
    private Handler next;

    @Override
    public void setHandler(Handler nextHandler) {
        this.next = nextHandler;
    }
    @Override
    public void handleRequest(String issueType) {
        if(issueType.equals("sifre")){
            System.out.println("Düz Memur: Şifreniz başarıyla sıfırlandı.");
        }else{
            if (next != null) {
                next.handleRequest(issueType);
            }
        }
    }
}


class KidemliMemur implements Handler {
    private Handler next;

    @Override
    public void setHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(String issueType) {
        if (issueType.equals("Ban")) {
            System.out.println("Kıdemli Memur: Hesabınızın banı kaldırıldı.");
        }
        else {
            if (next != null) {
                next.handleRequest(issueType);
            }
        }
    }
}


class Muhendis implements Handler {
    private Handler next;

    @Override
    public void setHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(String issueType) {
        if (issueType.equals("Cokus")) {
            System.out.println("Mühendis: Veritabanı çökme sorunu düzeltildi!");
        } else {
            System.out.println("Hata: Bu sorun sistemde hiç kimse tarafından çözülemedi!");
        }
    }
}