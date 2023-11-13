public abstract class Arrays
{
    public void display(double[] a, int n)
    {
        for(int i=0; i<n; i++)
            System.out.println(a[i]);
    }

    public abstract void insert(double value);

    public abstract void delete(double value);
}
