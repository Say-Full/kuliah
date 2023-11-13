
/**
 * Kelas BarisanFibonacci adalah kelas turunan dari kelas Barisan yang akan mengolah angka yang nilainya didapat dari penjumlahan dua nilai sebelumnya dengan cara
 * mengubah atribut nilaiBerikutnya dalam superclass-nya.
 *
 * @author Muhammad Saifullah Sani
 * @version 06-12-2020
 */
public class BarisanFibonacci extends Barisan
{
    public int nilaiSebelumnya;

    /**
     * Method constructor untuk memberikan nilai awal atribut nilaiBerikutnya dalam superclass sesuai dengan constructor superclass tanpa parameter yang akan memberikan
     * nilai awal atribut nilaiBerikutnya dengan nilai 0 dan memberikan nilai awal atribut nilaiSebelumnya yang bernilai 1.
     */
    public BarisanFibonacci()
    {
        super();
        nilaiSebelumnya = 1;
    }

    /**
     * Mengolah nilai atribut nilaiBerikutnya pada superclass dengan cara ditambah dengan 2 angka sebelumnya. Lalu, nilai atribut nilaiSebelumnya akan di-update memegang nilai
     * atribut nilaiBerikutnya yang belum diolah.
     */
    public void naik()
    {
        super.nilaiBerikutnya = super.nilaiBerikutnya + this.nilaiSebelumnya;
        this.nilaiSebelumnya = super.nilaiBerikutnya - this.nilaiSebelumnya;
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
