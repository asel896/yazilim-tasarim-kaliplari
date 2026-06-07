public class Main {
    public static void main(String[] args) {
        UiFactory fabrika=new WindowsFactory();

        ButtonProduct buton=fabrika.createButtonProduct();
        CheckboxProduct checkbox = fabrika.createCheckboxProduct();

        buton.paint();
        checkbox.toggle();
    }
}