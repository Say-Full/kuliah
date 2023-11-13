
/**
 * Class untuk objek Rectangle (persegi panjang) yang merupakan child class dari
 * class Shape.
 *
 * @author Muhammad Saifullah Sani
 * NPM 1908107010062
 * @version 09/11/2020
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;
    private String color;

    public Rectangle()
    {
        super();
        length = 5;
        width = 10;
    }
    
    public Rectangle(double l, double w)
    {
        super();
        this.length = l;
        this.width = w;
    }
    
    public double getLength()
    {
        return this.length;
    }
    
    public void setLength(double l)
    {
        this.length = l;
    }
    
    public double getWidth()
    {
        return this.width;
    }
    
    public void setWidth(double w)
    {
        this.width = w;
    }
    
    @Override
    public double getArea()
    {
        return this.length * this.width;
    }
    
    @Override
    public String toString()
    {
        return "Panjang = " + this.length +
        ", lebar = " + this.width +
        ", warna = " + super.getColor() +
        ", luas = " + this.getArea();
    }
}
