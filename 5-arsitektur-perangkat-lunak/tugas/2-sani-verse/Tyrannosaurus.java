/**
 * Class untuk menambahkan dekorasi gambar Tyrannosaurus pada papan AR.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public class Tyrannosaurus extends PapanARDecorator
{
    /**
     * Method untuk menginstansiasi objek ke dalam papan AR sehingga papan AR tersebut dapat menampilkan dinosaurus yang berjenis Tyrannosaurus.
     * 
     * @param papanAR objek papan AR
     */
    public Tyrannosaurus(PapanAR papanAR)
    {
        super(papanAR);
    }    

    /**
     * Method untuk menampilkan gambar Tyrannosaurus di atas papan AR.
     */
    @Override
    public void gambar()
    {
        super.gambar();
        System.out.print(" Tyrannosaurus");
    }

    /**
     * Method untuk mengembalikan harga gambar Tyrannosaurus.
     * 
     * @return harga fitur gambar Tyrannosaurus.
     */
    @Override
    public int getHarga()
    {
        return 500000;
    }
}
