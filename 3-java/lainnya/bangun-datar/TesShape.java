
/**
 * Untuk menguji method getArea di setiap class pada projek ini.
 *
 * @author Muhammad Saifullah Sani
 * MPM 1908107010062
 * @version 09/11/2020
 */
public class TesShape
{
    public static void main(String[] args)
    {
        Shape s = new Shape();
        System.out.println(s.getArea());
        
        s = new Circle();
        System.out.println(s.getArea());
        
        s = new Cylinder();
        System.out.println(s.getArea());
        
        s = new Rectangle();
        System.out.println(s.getArea());
    }
}
