import java.util.ArrayList;

/**
 * Class untuk mengolah fitur pada papan AR pelanggan.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public class Fitur
{
    private ArrayList<PapanARDecorator> fitur;

    /**
     * Method untuk menginstansiasi ArrayList untuk menyimpan fitur-fitur yang pelanggan pilih.
     */
    public Fitur()
    {
        fitur = new ArrayList<>();
    }

    /**
     * Method untuk menyimpan fitur yang pelanggan pilih ke dalam ArrayList.
     * 
     * @param fiturTambahan fitur yang pelanggan pilih untuk ditambahkan ke papan AR miliknya.
     */
    public void tambahFitur(PapanARDecorator fiturTambahan)
    {
        fitur.add(fiturTambahan);
    }

    /**
     * Method untuk menghitung dan mengembalikan total harga dari semua fitur yang telah pelanggan pilih.
     * 
     * @return total harga dari fitur-fitur yang telah pelanggan pilih.
     */
    public int totalHarga()
    {
        int total = 0;

        for(PapanARDecorator f : fitur) {
            total += f.getHarga();
        }

        return total;
    }

    /**
     *  Method untuk mencari suatu fitur dari sekumpulan fitur yang telah pelanggan pilih.
     * 
     * @param suatuFitur fitur yang ingin dicari.
     * @return true jika fitur yang dicari itu ditemukan dan false jika fitur yang dicari tidak ditemukan.
     */
    public boolean cariFitur(PapanARDecorator suatuFitur)
    {
        if(fitur.contains(suatuFitur)) {
            return true;
        }
        else {
            return false;
        }
    }
}
