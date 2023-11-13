public class Oreo extends IceCreamDecorator {
    public Oreo(IceCream iceCream) {
        super(iceCream);
    }

    public String decorate() {
        return super.decorate() + this.decorateWithOreo();
    }

    public String decorateWithOreo(){
        return " with Oreo";
    }
}