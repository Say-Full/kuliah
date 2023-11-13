
/**
 * Kelas BarisanGeometri adalah kelas turunan dari kelas Barisan yang akan mengolah angka yang nilainya akan dikali dengan nilai rasio pengalinya dengan cara
 * mengubah atribut nilaiBerikutnya dalam superclass-nya.
 *
 * @author Muhammad Saifullah Sani
 * @version 06-12-2020
 */
public class BarisanGeometri extends Barisan
{
    public int rasioPengali;

    /**
     * Method constructor untuk memberikan nilai awal atribut nilaiBerikutnya dalam superclass sesuai dengan nilai pada parameternya dan memberikan nilai atribut rasioPengali.
     * @param nilaiAwal memberikan nilai awal untuk atribut nilaiBerikutnya dalam superclass.
     * @param rasioPengali memberikan nilai atribut rasioPengali.
     */
    public BarisanGeometri(int nilaiAwal, int rasioPengali)
    {
       super(nilaiAwal);
       this.rasioPengali = rasioPengali;
    }

    /**
     * Mengolah nilai atribut nilaiBerikutnya pada superclass dengan cara dikalikan dengan nilai rasioPengali.
     */
    public void naik()
    {
        super.nilaiBerikutnya *= rasioPengali;
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
