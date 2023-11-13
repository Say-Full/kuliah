public class ArrayTakTerurut extends Arrays
{
    private double[] a;
    private int nElems;

    public ArrayTakTerurut (int max)
    {
        a = new double[max];
        nElems = 0;
    }

    public int size()
    {
        return nElems;
    }

    public void display()
    {
        super.display(a, nElems);
    }

    public int sequentSearch(double searchKey)
    {
        int n = nElems;
        int i = 0;

        while(i < n) {
            if(a[i] == searchKey) {
                return i;
            }
            i++;
        }
        return n;
    }

    @Override
    public void insert(double value)
    {
        a[nElems] = value;
        nElems++;
    }

    @Override
    public void delete(double value)
    {
        int posisiIndeks = this.sequentSearch(value);

        if(posisiIndeks == nElems) {
            System.out.println("Posisi data yang dihapus tidak ditemukan");
        }
        else {
            for(int i = posisiIndeks; i < nElems; i++) {
                a[posisiIndeks] = a[posisiIndeks+1];
            }
            nElems--;
        }
    }
}
