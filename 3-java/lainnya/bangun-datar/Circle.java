
/**
 * Class untuk objek Circle (lingkaran) yang diturunkan dari class Shape (bentuk).
 *
 * @author Muhammad Saifullah Sani
 * NPM 1908107010062
 * @version 09/11/2020
 */
public class Circle extends Shape
{
    private double radius;
    private String color;

    public Circle()
    {
        radius = 7;
        color = "blue";
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    @Override
    public double getArea()
    {
        return 22/7 * this.radius * this.radius;
    }
    
    @Override
    public String toString()
    {
        return "Jari-jari = " + this.radius +
        ", warna = " + this.color +
        ", dan luas = " + this.getArea();
    }
}
