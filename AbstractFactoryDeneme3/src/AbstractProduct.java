interface Chair {
    void sitOn();
}

interface Sofa{
    void lieOn();
}


class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Modern Chair");
    }
}

class RetroChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Retro Chair");
    }
}

class ModernSofa implements Sofa{
    @Override
    public void lieOn() {
        System.out.println("Modern Sofa");
    }
}

class RetroSofa implements Sofa{
    @Override
    public void lieOn() {
        System.out.println("Retro Sofa");
    }
}