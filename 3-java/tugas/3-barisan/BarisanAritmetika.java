
/**
 * Kelas BarisanAritmetika adalah kelas turunan dari kelas Barisan yang akan mengolah angka yang nilainya akan bertambah sesuai dengan kenaikannya dengan cara
 * mengubah atribut nilaiBerikutnya dalam superclass-nya.
 *
 * @author Muhammad Saifulah Sani
 * @version 06-12-2020
 */
public class BarisanAritmetika extends Barisan
{
    public int kenaikan;

    /**
     * Method constructor untuk memberikan nilai awal atribut nilaiBerikutnya dalam superclass sesuai dengan nilai pada parameternya dan memberikan nilai atribut kenaikan.
     * @param nilaiAwal memberikan nilai awal untuk atribut nilaiBerikutnya dalam superclass.
     * @param kenaikan memberikan nilai awal atribut kenaikan.
     */
    public BarisanAritmetika(int nilaiAwal, int kenaikan)
    {
        super(nilaiAwal);
        this.kenaikan = kenaikan;
    }

    /**
     * Mengolah nilai atribut nilaiBerikutnya pada superclass dengan cara ditambah dengan nilai kenaikan.
     */
    public void naik()
    {
        super.nilaiBerikutnya += kenaikan;
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