public class Caramel extends IceCreamDecorator {
    public Caramel(IceCream iceCream) {
        super(iceCream);
    }

    public String decorate() {
        return super.decorate() + this.decorateWithCaramel();
    }

    public String decorateWithCaramel(){
        return " with Caramel";
    }
}