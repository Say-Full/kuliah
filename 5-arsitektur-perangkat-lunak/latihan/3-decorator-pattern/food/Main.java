public class Main {
    public static void main (String[] args) {
        IceCream wals = new Caramel(new Oreo(new Wals()));
        System.out.println(wals.decorate());
    }
}