
/**
 * @Muhammad Saifullah Sani
 * @20/10/2020
 */
public class Rectangle
{
    private double length;
    private double width;
    private String color;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        length = 10.0;
        width = 7.0;
        color = "Blue";
    }

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }
    
    public void setLength(double length)
    {
        this.length = length;
    }
    
    public double getWidth()
    {
        return this.width;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    /**
     * @return the area of this rectangle
     */
    public double getArea()
    {
        return length*width;
    }
    
    public String toString()
    {
        return "Panjang persegi panjang = " + this.length +
               ", ebar persegi panjang = " + this.width +
               " Luas persegi panjang tersebut adalah = " + getArea();
    }
}
