
/**
 * Class utama yang digunakan untuk menjalankan simulasi aplikasi SunFull.
 *
 * @author Muhammad Saifullah Sani
 * @NPM 1908107010062
 * 
 * @author Sausan Nabilah
 * @NPM 1908107010093
 * 
 * @version 18 Maret 2022
 */
public class Main
{
    public static void main(String[] args)
    {
        Kelola rumahKos = new RumahKos();
        Admin admin = new Admin();
        Penyewa penyewa1 = new Penyewa("Saiful", "0852123456789", "A1");
        Penyewa penyewa2 = new Penyewa("Sani", "0852987654321", "B3");
        PembayaranDigital bsi = new BSI();
        PembayaranDigital bca = new BCA();
        
        admin.connectTo(rumahKos);
        admin.cekKamarKosong();
        admin.tambahPenyewa(penyewa1);
        admin.tambahPenyewa(penyewa2);
        System.out.println();
        admin.cekKamarKosong();
        admin.cekParaPenyewa();
        System.out.println("\n\n");
        
        Pembayaran tombolBayar = new TombolBayar();
        penyewa1.connectTo(tombolBayar);
        penyewa1.bayarUangSewa((BayarSewa) rumahKos, bsi);
        System.out.println();
        penyewa2.connectTo(tombolBayar);
        penyewa2.bayarUangSewa((BayarSewa) rumahKos, bca);
    }
}
