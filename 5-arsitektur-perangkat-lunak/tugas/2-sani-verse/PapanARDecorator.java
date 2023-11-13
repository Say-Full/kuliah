/**
 * Class untuk dekorasi papan AR menggunakan gambar dinosaurus.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public abstract class PapanARDecorator implements PapanAR
{
    private PapanAR papanAR;
    
    /**
     * Method untuk membuat objek papan AR yang dapat menampilkan gambar dinosaurus.
     * 
     * @param papanAR objek papan AR.
     */
    public PapanARDecorator(PapanAR papanAR)
    {
        this.papanAR = papanAR;
    }

    /**
     * Method untuk menampilkan gambar dinosaurus di atas papan AR.
     */
    @Override
    public void gambar()
    {
        this.papanAR.gambar();
    }

    /**
     * Method untuk mengembalikan harga setiap gambar dinosaurus.
     * 
     * @return harga dari fitur suatu gambar dinosaurus.
     */
    public abstract int getHarga();
}
