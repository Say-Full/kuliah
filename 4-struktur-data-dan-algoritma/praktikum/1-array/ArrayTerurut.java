public class ArrayTerurut extends Arrays
{
    private double[] a;
    private int nElems;

    public ArrayTerurut(int max)
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

    public int binarySearch(double searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
  
        while(true) {
            curIn = (lowerBound + upperBound ) / 2;
            
            if(a[curIn]==searchKey) {
                return curIn;
            }
            
            if(lowerBound > upperBound) {
                return nElems;
            }
            else {
                if(a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                }
                else {
                    upperBound = curIn - 1;
                }
            }
        }
    }
  
    @Override
    public void insert(double value)
    {
        int j;

        for(j=0; j<nElems; j++) {
            if(a[j] > value) {
                break;
            }
        }

        for(int k=nElems; k>j; k--) {
            a[k] = a[k-1];
        } 

        a[j] = value;
        nElems++;
    }

    @Override
    public void delete(double value)
    {
        int posisiIndeks = this.binarySearch(value);

        if(posisiIndeks == nElems) {
            System.out.println("Posisi data yang dihapus tidak ditemukan.");
        }
        else {
            for(int i=posisiIndeks; i<nElems; i++) {
                a[posisiIndeks] = a[posisiIndeks+1];
            }
            
            nElems--;
        }
    }
}
