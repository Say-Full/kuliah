import java.util.ArrayList;

/**
 * Class yang melakukan implements terhadap interface Observable yang digunakan untuk membuat objek pemilik toko.
 * Class ini menyimpan dan mengolah data para pelanggan.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public class Pemilik implements Observable
{
    private ArrayList<Observer> paraPelanggan;

    /**
     * Method untuk menginstansiasi ArrayList untuk menyimpan data pelanggan.
     */
    public Pemilik()
    {
        paraPelanggan = new ArrayList<>();
    }

    /**
     * Method untuk menambahkan pelanggan.
     * 
     * @param observer pelanggan toko SaniVerse.
     */
    @Override
    public void tambahObserver(Observer observer)
    {
        paraPelanggan.add(observer);
    }

    /**
     * Method untuk menghapus pelanggan.
     * 
     * @param observer pelanggan toko SaniVerse.
     */
    @Override
    public void hapusObserver(Observer observer)
    {
        paraPelanggan.remove(observer);
    }

    /**
     * Method untuk memberikan notifikasi kepada setiap pelanggan.
     * 
     * @param info informasi terbaru yang ingin disampaikan kepada semua pelanggan.
     */
    @Override
    public void beritahu(String info)
    {
        for(Observer pelanggan : paraPelanggan) {
            pelanggan.perbarui(info);
        }
    }
}