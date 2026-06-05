public interface SekilPrototype {
    SekilPrototype clone();
}

class Circle implements SekilPrototype {
    private int yariCap;
    private String renk;

    public Circle(int yariCap, String renk) {
        this.yariCap = yariCap;
        this.renk = renk;
    }

    @Override
    public SekilPrototype clone() {
        return new Circle(this.yariCap, this.renk);
    }

    public void sekilBilgisi(){
        System.out.println("renk : " + this.renk+ "yaricap : " + this.yariCap);
    }

}

