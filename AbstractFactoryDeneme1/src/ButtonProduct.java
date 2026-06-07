public interface ButtonProduct {
    void paint();
}

interface CheckboxProduct {
    void toggle();
}

class WindowsButton implements ButtonProduct{
    @Override
    public void paint() {
        System.out.println("Windows Butonu çizildi.");
    }
}


class MacButton implements ButtonProduct{
    @Override
    public void paint() {
        System.out.println("Mac Butonu çizildi.");
    }
}

class WindowsCheckbox implements CheckboxProduct {
    @Override
    public void toggle() {
        System.out.println("Windows Checkbox durumu değiştirildi.");
    }
}

// Mac Checkbox
class MacCheckbox implements CheckboxProduct {
    @Override
    public void toggle() {
        System.out.println("Mac Checkbox durumu değiştirildi.");
    }
}