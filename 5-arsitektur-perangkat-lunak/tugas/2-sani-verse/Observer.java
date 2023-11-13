/**
 * Interface yang akan digunakan pada class untuk membuat observer.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public interface Observer
{
    /**
     * Method untuk memberikan notifikasi kepada pelanggan tersebut.
     * 
     * @param info informasi yang akan diterima oleh setiap pelanggan.
     */
    public void perbarui(String info);
}
