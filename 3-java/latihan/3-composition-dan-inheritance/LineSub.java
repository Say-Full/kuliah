/**
 * Write a description of class LineSub here.
 *
 * @author Muhammad Saifullah Sani
 * @version 02/11/2020
 */
public class LineSub extends Point
{
   private Point end;

   public LineSub(int x1, int y1, int x2, int y2)
   {
       super(x1, y1);
       end = new Point(x2, y2);
   }
    
   public LineSub(Point begin, Point end)
   {
       super(begin.getX(), begin.getY());
       this.end = end;
   }

   public Point getEnd()
   {
       return this.end;
   }
    
   public void setEnd(Point end)
   {
       this.end = end;
   }
    
   public Point getBegin()
   {
       return this;
   }
    
   public void setBegin(Point begin)
   {
       super.setX(begin.getX());
       super.setY(begin.getY());
   }
    
   public int getBeginX()
   {
       return super.getX();
   }
    
   public void setBeginX(int x)
   {
       super.setX(x);
   }
    
   public int getBeginY()
   {
       return super.getY();
   }
    
   public void setBeginY(int y)
   {
       super.setY(y);
   } 
   
   public void setBeginXY(int x, int y)
   {
       super.setX(x);
       super.setY(y);
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
    
   public void setEndY(int y)
   {
       end.setY(y);
   } 
   
   public void setEndXY(int x, int y)
   {
       end.setX(x);
       end.setY(y);
   }
    
   public String toString()
   {
       return "Titik awal garis adalah " + super.toString() +
       "  dan  titik akhir garis adalah " + end.toString();
   }
    
    public double getLength()
    {
        return Math.sqrt((Math.pow((this.getX() - end.getX()), 2))
        +
        (Math.pow((this.getY() - end.getY()), 2)));
    }
}
