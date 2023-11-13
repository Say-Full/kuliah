/**
 * Interface yang akan digunakan pada class untuk membuat observable.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public interface Observable
{
    /**
     * Method untuk menambahkan pelanggan.
     * 
     * @param observer objek pelanggan.
     */
    public void tambahObserver(Observer observer);

    /**
     * Method untuk menghapus pelanggan.
     * 
     * @param observer objek pelanggan.
     */
    public void hapusObserver(Observer observer);

    /**
     * Method untuk memberikan notifikasi kepada setiap pelanggan.
     * 
     * @param info informasi terbaru yang ingin disampaikan kepada semua pelanggan.
     */
    public void beritahu(String info);
}
