
/**
 * Kelas BarisanPangkat adalah kelas turunan dari kelas Barisan yang akan mengolah angka yang nilainya didapat dari pemangkatan dari angka satu dengan
 * angka tertentu dengan cara mengubah atribut nilaiBerikutnya dalam superclass-nya.
 *
 * @author Muhammad Saifullah Sani
 * @version 06-12-2020
 */
public class BarisanPangkat extends Barisan
{
    public int pangkat;
    private int pembagi;
    
    /**
     * Method constructor untuk memberikan nilai awal atribut nilaiBerikutnya dalam superclass sesuai dengan nilai pada parameternya, memberikan nilai atribut pangkat, dan memberikan
     * nilai awal atribut pembagi.
     */
    public BarisanPangkat(int pangkat)
    {
        super(1);
        this.pangkat = pangkat;
        this.pembagi = 1;
    }

    /**
     * Mengolah nilai atribut nilaiBerikutnya pada superclass dengan cara dipangkatkan dengan nilai atribut pangkat.
     */
    public void naik()
    {
        for(int i = 1; i < pangkat; i++) {
            super.nilaiBerikutnya /= pembagi;
        }
        pembagi++;
        super.nilaiBerikutnya++;
        super.nilaiBerikutnya = (int) (Math.pow(super.nilaiBerikutnya, this.pangkat));
    }
    
    /**
     * Method untuk mencetak nilai hasil olahan.
     * @return mencetak nilai atribut nilaiBerikutnya yang telah diolah.
     */
    public String toString()
    {
        return super.berikutnya() + " ";
    }
}
