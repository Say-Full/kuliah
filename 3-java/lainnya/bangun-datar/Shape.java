
/**
 * Class untuk objek Shape (bentuk).
 *
 * @author Muhammad Saifullah Sani
 * NPM 1908107010062
 * @version 09/11/2020
 */
public class Shape
{
    private String color;

    public Shape()
    {
        color = "red";
    }
    
    public Shape(String c)
    {
        this.color = c;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public double getArea()
    {
        return 0.0;
    }
    
    public String toString()
    {
        return "warna = " + this.color +
        " dan luas = " + this.getArea();
    }
}
