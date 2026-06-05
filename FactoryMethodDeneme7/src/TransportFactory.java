public class TransportFactory {
    public static Transport getTransport(String type,int kapasite,int hiz){
        if("Ucak".equals(type)){
            return new Ucak(kapasite,hiz);
        }
        else if("Gemi".equals(type)){
            return new Gemi(kapasite,hiz);
        }
        return null;
    }
}
