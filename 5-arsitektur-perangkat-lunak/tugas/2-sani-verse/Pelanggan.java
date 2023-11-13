/**
 * Class yang melakukan implements terhadap interface Observer yang digunakan untuk membuat objek pelanggan toko.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public class Pelanggan implements Observer
{
    private String namaPelanggan;

    /**
     * Method untuk membuat objek pelanggan sekaligus menetapkan nama pelanggan.
     * 
     * @param namaPelanggan nama dari seorang pelanggan.
     */
    public Pelanggan(String namaPelanggan)
    {
        this.namaPelanggan = namaPelanggan;
    }

    /**
     * Method untuk memberikan notifikasi kepada pelanggan tersebut.
     * 
     * @param info informasi yang akan diterima oleh setiap pelanggan.
     */
    @Override
    public void perbarui(String info)
    {
        System.out.println(this.namaPelanggan + ", ada informasi baru nih dari SaniVerse : " + info);
    }
}