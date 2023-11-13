
/**
 * Class untuk objek Cylinder (silinder) yang diturunkan dari class Circle (lingkaran).
 *
 * @author Muhammad Saifullah Sani
 * NPM 1908107010062
 * @version 09/11/2020
 */
public class Cylinder extends Circle
{
    private double height;
    
    public Cylinder()
    {
        super();
        height = 5;
    }
    
    public Cylinder(double radius)
    {
        super(radius);
    }
    
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }
    
    public double getHeight()
    {
        return this.height;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getVolume()
    {
        return super.getArea() * this.height;
    }
    
    @Override
    public double getArea()
    {
        return (2 * 22/7 * super.getRadius() * this.height ) +
        (2 * super.getArea() );
    }
    
    @Override
    public String toString()
    {
        return "Jari-jari = " + super.getRadius() +
        ", warna = " + super.getColor() +
        ", tinggi = " + this.height +
        ", dan luas = " + this.getArea();
    }
}
