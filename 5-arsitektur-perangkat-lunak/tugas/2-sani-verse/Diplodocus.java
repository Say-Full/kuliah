/**
 * Class untuk menambahkan dekorasi gambar Diplodocus pada papan AR.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public class Diplodocus extends PapanARDecorator
{
    /**
     * Method untuk menginstansiasi objek ke dalam papan AR sehingga papan AR tersebut dapat menampilkan dinosaurus yang berjenis Diplodocus.
     * 
     * @param papanAR objek papan AR.
     */
    public Diplodocus(PapanAR papanAR)
    {
        super(papanAR);
    }    

    /**
     * Method untuk menampilkan gambar Diplodocus di atas papan AR.
     */
    @Override
    public void gambar()
    {
        super.gambar();
        System.out.print(" Diplodocus");
    }

    /**
     * Method untuk mengembalikan harga gambar Diplodocus.
     * 
     * @return harga fitur gambar Diplodocus.
     */
    @Override
    public int getHarga()
    {
        return 400000;
    }
}
