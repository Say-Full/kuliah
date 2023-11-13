
/**
 * Class Danau adalah class yang akan dijadikan objek permainan yang
 * menyediakan dan mengatur batu tempat katak berada.
 *
 * @author Muhammad Saifullah Sani
 * @NPM 1908107010062
 * @version 15/11/2020
 */
public class Danau
{
    private int jumlahBatu;
    private int[][] batu;

    /**
     * Constructor untuk class Danau
     */
    public Danau()
    {
        this.jumlahBatu = 5;
        batu = new int [this.jumlahBatu][this.jumlahBatu];
        buatBatu();
    }

    /**
     * Constructor untuk class Danau yang menerima input dari pemain
     */
    public Danau(int jumBatu)
    {
        this.jumlahBatu = jumBatu;
        batu = new int [this.jumlahBatu][this.jumlahBatu];
        buatBatu();
    }

    /**
     * Method untuk menginisialisasi array batu sebelum katak melompat
     */
    private void buatBatu()
    {
        for(int[] baris : batu) {
           for(int kolom : baris) {
               kolom = 0;
            }
        }
    }

    /**
     * Menentukan batu tempat katak berada
     */
    public void tambahKatak(int baris, int kolom)
    {
        batu[baris][kolom] = 1;
    }

    /**
     * Memeriksa apakah tebakan pemain benar atau salah
     */
    public boolean adaKatak(int baris, int kolom)
    {
        if(batu[baris][kolom] == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Menghapus posisi katak semula
     */
    public void hapusKatak(int baris, int kolom)
    {
        batu[baris][kolom] = 0;
    }
}
