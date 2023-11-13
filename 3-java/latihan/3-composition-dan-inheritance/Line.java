
/**
 * To show example of composition.
 *
 * @author Muhammad Saifullah Sani
 * @version 02/11/2020
 */
public class Line
{
    private Point begin;
    private Point end;

    public Line(int x1, int y1, int x2, int y2)
    {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    
    public Line(Point begin, Point end)
    {
        this.begin = begin;
        this.end = end;
    }
    
    public Point getBegin()
    {
        return this.begin;
    }
    
    public void setBegin(Point begin)
    {
        this.begin = begin;
    }
    
    public Point getEnd()
    {
        return this.end;
    }
    
    public void setEnd(Point end)
    {
        this.end = end;
    }
    
    public int getBeginX()
    {
        return begin.getX();
    }
    
    public void setBeginX(int x)
    {
        begin.setX(x);
    }
    
    public int getBeginY()
    {
        return begin.getY();
    }
    
    public void setBeginY(int Y)
    {
        begin.setY(Y);
    }
    
    public void setBeginXY(int x, int y)
    {
        begin.setX(x);
        begin.setY(y);
    }
    
    public int getEndX()
    {
        return end.getX();
    }
    
    public void setEndX(int x)
    {
        end.setX(x);
    }
    
    public int getEndY()
    {
        return end.getY();
    }
    
    public void setEndY(int Y)
    {
        end.setY(Y);
    }
    
    public void setEndXY(int x, int y)
    {
        end.setX(x);
        end.setY(y);
    }
    
    public String toString()
    {
        return "Titik awal garis adalah " + begin.toString() +
        "  dan  titik akhir garis adalah " + end.toString();
    }
    
    public double getLength()
    {
        return Math.sqrt((Math.pow((begin.getX() - end.getX()), 2))
        +
        (Math.pow((begin.getY() - end.getY()), 2)));
    }
}
