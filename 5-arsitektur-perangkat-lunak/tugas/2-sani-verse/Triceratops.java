/**
 * Class untuk menambahkan dekorasi gambar Triceratops pada papan AR.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public class Triceratops extends PapanARDecorator
{
    /**
     * Method untuk menginstansiasi objek ke dalam papan AR sehingga papan AR tersebut dapat menampilkan dinosaurus yang berjenis Triceratops.
     * 
     * @param papanAR objek papan AR.
     */
    public Triceratops(PapanAR papanAR)
    {
        super(papanAR);
    }

    /**
     * Method untuk menampilkan gambar Triceratops di atas papan AR.
     */
    @Override
    public void gambar()
    {
        super.gambar();
        System.out.print(" Triceratops");
    }

    /**
     * Method untuk mengembalikan harga gambar Triceratops.
     * 
     * @return harga fitur gambar Triceratops.
     */
    @Override
    public int getHarga()
    {
        return 300000;
    }
}
