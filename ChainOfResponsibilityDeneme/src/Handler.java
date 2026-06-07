public interface Handler {
    void setNext(Handler nextHandler);
    void handleRequest(int amount);
}

class ConcreteHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
    @Override
    public void handleRequest(int amount) {
        if(amount <=1000){
            System.out.println("Takım Lideri harcamayı onayladı.");
        }else{
            if(next != null){
                next.handleRequest(amount);
            }else {
                System.out.println("Harcama hiçbir yetkili tarafından onaylanamadı!");
            }
        }
    }
}


class ConcreteHandler2 implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
    @Override
    public void handleRequest(int amount) {
        if(amount <=5000){
            System.out.println("Müdür harcamayı onayladı.");
        }else{
            if(next != null){
                next.handleRequest(amount);
            }else {
                System.out.println("Limit aşıldı, onaylanamadı!");
            }
        }
    }
}