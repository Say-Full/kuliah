public abstract class IceCreamDecorator implements IceCream {
    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    
    @Override
    public String decorate(){
        return iceCream.decorate();
    }
}