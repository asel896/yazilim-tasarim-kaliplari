public interface UiFactory {
    ButtonProduct createButtonProduct();
    CheckboxProduct createCheckboxProduct();

}

class WindowsFactory implements UiFactory {
    @Override
    public ButtonProduct createButtonProduct() {
        return new WindowsButton();
    }
    @Override
    public CheckboxProduct createCheckboxProduct() {
        return new WindowsCheckbox();
    }
}

class MacFactory implements UiFactory {
    @Override
    public ButtonProduct createButtonProduct() {
        return new MacButton();
    }
    @Override
    public CheckboxProduct createCheckboxProduct() {
        return new MacCheckbox();
    }
}