public interface AtmDispenser {
    void setNext(AtmDispenser nextDispenser); // sonraki vagonu baglamak icin
    void dispense(int amount);  // parayi cekmek ve islemek icin
}

class Dispenser200Tl implements AtmDispenser {
    private AtmDispenser next;

    @Override
    public void setNext(AtmDispenser nextDispenser) {
        this.next = nextDispenser;
    }
    @Override
    public void dispense(int amount) {
        if(amount>=200){
            int adet=amount/200;
            System.out.println("200 TL x " + adet);
            int kalan=amount%200;
            if(kalan>0){
                if(next!=null){
                    next.dispense(adet);
                }else{
                    next.dispense(amount);
                }
            }
        }
    }
}


class Dispenser100Tl implements AtmDispenser {
    private AtmDispenser next;
    @Override
    public void setNext(AtmDispenser nextDispenser) {
        this.next = nextDispenser;
    }
    @Override
    public void dispense(int amount) {
        if(amount>=100){
            int adet=amount/100;
            System.out.println("100 TL x " + adet);
            int kalan=amount%100;
            if(kalan>0){
                if(next!=null){
                    next.dispense(adet);
                }else{
                    next.dispense(amount);
                }
            }
        }
    }
}


class Dispenser50Tl implements AtmDispenser {
    private AtmDispenser next;
    @Override
    public void setNext(AtmDispenser nextDispenser) {
        this.next = nextDispenser;
    }
    @Override
    public void dispense(int amount) {
        if(amount>=50){
            int adet=amount/50;
            System.out.println("50 TL x " + adet);
            int kalan=amount%50;
            if(kalan>0){
                if(next!=null){
                    next.dispense(adet);
                }else{
                    next.dispense(amount);
                }
            }
        }
    }
}