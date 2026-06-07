public interface Internet {
    void connectTo(String serverUrl);
}


class RealInternet implements Internet {
    @Override
    public void connectTo(String serverUrl) {
        System.out.println("Gerçek İnternet: " + serverUrl + " sitesine başarıyla bağlanıldı.");
    }
}
 

class ProxyInternet implements Internet {
    private Internet internet;


    @Override
    public void connectTo(String serverUrl) {
        if(serverUrl==yasaklicom){
            System.out.println("Proxy: ERİŞİM ENGELLENDİ! Bu siteye giriş yasaktır!");
        }else{
            if(internet==null){
                internet = new RealInternet();

            }

        }
    }
}