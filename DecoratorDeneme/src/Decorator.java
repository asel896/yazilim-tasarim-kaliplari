// hem component arayuzunu uygular(is-a) hem de icinde component turunde nesne saklar(has-a)->composition

public abstract class Decorator implements Component {
    // İçeride sarılacak nesneyi tutar
    protected Component decoratedComponent;

    // Constructor ile dışarıdan süslenecek nesneyi alır
    public Decorator(Component component) {
        this.decoratedComponent = component;
    }

    @Override
    public void operation() {
        // Kendisine verilen nesnenin kendi metodunu tetikler
        decoratedComponent.operation();
    }
}
