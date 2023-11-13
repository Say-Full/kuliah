
/**
 * Class Pemain adalah class yang digunakan untuk pembuatan objek pemain yang memainkan
 * permainan ini
 *
 * @author Muhammad Saifullah Sani
 * @NPM 1908107010062
 * @version 15/11/2020
 */
public class Pemain
{
    private String nama;
    private int nilai;

    /**
     * Constructor untuk class Pemain
     */
    public Pemain(String nama)
    {
        this.nama = nama;
        this.nilai = 0;
    }

    /**
     * Menampilkan nama pemain
     */
    public String getNama()
    {
        return this.nama;
    }

    /**
     * Mengubah nama pemain
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * Menampilkan nilai pemain
     */
    public int getNilai()
    {
        return this.nilai;
    }

    /**
     * Mengatur nilai pemain
     */
    public void setNilai(int nilaiBaru)
    {
        this.nilai = nilaiBaru;
    }
}