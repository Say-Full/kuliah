
/**
 * Class Point3D is a child class of class Point.
 *
 * @author Muhammad Saifullah Sani
 * @version 02/11/2020
 */
public class Point3D extends Point
{
    private int z;

    public Point3D()
    {
        super();
        z = 20;
    }
    
    public Point3D(int x, int y, int z)
    {
        super(x, y);
        this.z = z;
    }

    public int getZ()
    {
        return z;
    }
    
    public void setZ(int z)
    {
        this.z = z;
    }
    
    public String toString()
    {
        return super.toString() + ", nilai z = " + z;
    }
}
