import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Class Main digunakan untuk menjalankan proyek.
 *
 * @author Muhammad Saifullah Sani
 * @version 06/12/2021
 */
public class Main
{
    private static Scanner input = new Scanner(System.in);

    /**
     * Method untuk mengolah fitur (gambar) yang dipilih untuk papan AR dan mencetak total biayanya.
     * 
     * @param isTyrannosaurus cek apakah pelanggan ada memilih fitur gambar Tyrannosaurus.
     * @param isDiplodocus cek apakah pelanggan ada memilih fitur gambar Diplodocus.
     * @param isTriceratops cek apakah pelanggan ada memilih fitur gambar Triceratops.
     */
    public static void fiturPapanAR(boolean isTyrannosaurus, boolean isDiplodocus, boolean isTriceratops)
    {
        DecimalFormat formatAngka = new DecimalFormat("###,###.##");
        Fitur fitur = new Fitur();
        PapanAR papanAR;

        // Membuat objek berdasarkan fitur yang dipilih dengan mengimplementasikan konsep Strategy Pattern dan Decorator Pattern.
        if(isTyrannosaurus && isDiplodocus && isTriceratops) {
            fitur.tambahFitur(new Tyrannosaurus(new Dino()));
            fitur.tambahFitur(new Diplodocus(new Dino()));
            fitur.tambahFitur(new Triceratops(new Dino()));
            papanAR = new Tyrannosaurus(new Diplodocus(new Triceratops(new Dino())));
            papanAR.gambar();
        }
        else if(isDiplodocus && isTriceratops) {
            fitur.tambahFitur(new Diplodocus(new Dino()));
            fitur.tambahFitur(new Triceratops(new Dino()));
            papanAR = new Diplodocus(new Triceratops(new Dino()));
            papanAR.gambar();
        }
        else if(isTyrannosaurus && isTriceratops) {
            fitur.tambahFitur(new Tyrannosaurus(new Dino()));
            fitur.tambahFitur(new Triceratops(new Dino()));
            papanAR = new Tyrannosaurus(new Triceratops(new Dino()));
            papanAR.gambar();
        }
        else if(isTyrannosaurus && isDiplodocus) {
            fitur.tambahFitur(new Tyrannosaurus(new Dino()));
            fitur.tambahFitur(new Diplodocus(new Dino()));
            papanAR = new Tyrannosaurus(new Diplodocus(new Dino()));
            papanAR.gambar();
        }
        else if(isTyrannosaurus) {
            fitur.tambahFitur(new Tyrannosaurus(new Dino()));
            papanAR = new Tyrannosaurus(new Dino());
            papanAR.gambar();
        }
        else if(isDiplodocus) {
            fitur.tambahFitur(new Diplodocus(new Dino()));
            papanAR = new Diplodocus(new Dino());
            papanAR.gambar();
        }
        else if(isTriceratops) {
            fitur.tambahFitur(new Triceratops(new Dino()));
            papanAR = new Triceratops(new Dino());
            papanAR.gambar();
        }

        // Menampilkan total biaya berdasarkan fitur-fitur yang dipilih dengan memanfaatkan konsep Strategy Pattern.
        System.out.println("\nBiaya : Rp. " + formatAngka.format(fitur.totalHarga()));
    }

    /**
     * Method untuk menjalankan tahap pembelian.
     */
    public static void pembelian()
    {
        int banyakFitur = 0;
        String pilihFitur;
        boolean isTyrannosaurus = false;
        boolean isDiplodocus = false;
        boolean isTriceratops = false;

        // Menampilkan menu utama pembelian.
        System.out.println("\n\t ============== Selamat Datang di SaniVerse ==============\n");
        System.out.println("Disini kami menyediakan papan Augmented Reality (AR) dengan gambar-gambar berikut :");
        System.out.println("1. Tyrannosaurus\t(Rp. 500,000)\n2. Diplodocus\t\t(Rp. 400,000)\n3. Triceratops\t\t(Rp. 300,000)");
        System.out.print("\nSilahkan input banyak gambar untuk papan AR Anda : ");
        banyakFitur = input.nextInt();
        
        // Menanyakan gambar-gambar yang diinginkan.
        for(int i = 1; i <= banyakFitur; i++) {
            System.out.print("\nGambar " + i + " : ");
            pilihFitur = input.next();

            if(pilihFitur.equalsIgnoreCase("1") || pilihFitur.equalsIgnoreCase("Tyrannosaurus")) {
                isTyrannosaurus = true;
            }
            else if(pilihFitur.equalsIgnoreCase("2") || pilihFitur.equalsIgnoreCase("Diplodocus")) {
                isDiplodocus = true;
            }
            else if(pilihFitur.equalsIgnoreCase("3") || pilihFitur.equalsIgnoreCase("Triceratops")) {
                isTriceratops = true;
            }
        }

        System.out.println("\n");

        fiturPapanAR(isTyrannosaurus, isDiplodocus, isTriceratops);
    }

    /**
     * Method utama untuk menjalankan program.
     * 
     * @param args argumen CLA.
     */
    public static void main(String[] args)
    {
        String beli;

        // Menginstansiasi objek observable dan observer.
        Observable pemilik = new Pemilik();
        Observer saiful = new Pelanggan("Saiful");
        Observer sai = new Pelanggan("Sai");

        // Menambahkan pelanggan (observer).
        pemilik.tambahObserver(saiful);
        pemilik.tambahObserver(sai);

        // Mengosongkan layar.
        System.out.println("\033[H\033[2J");
        System.out.flush();

        // Memberitahu informasi terbaru kepada semua pelanggan dengan memanfaatkan konsep Observer Pattern.
        pemilik.beritahu("Toko SaniVerse sekarang menyediakan AR bergambar Triceratops, Diplodocus, dan Tyrannosaurus !");
        System.out.print("\nTekan enter untuk lanjut... ");
        try {
            System.in.read();
        }
        catch(Exception e) {}

        // Mengosongkan layar.
        System.out.println("\033[H\033[2J");
        System.out.flush();

        // Asumsikan pelanggannya adalah Saiful.
        pemilik.hapusObserver(sai);
        System.out.println("\n\t\t~ Selanjutnya kita akan berfokus pada pelanggan yang bernama Saiful ~\n\n");
        System.out.print("Apakah Anda ingin melakukan pembelian (y/n) ? ");
        beli = input.next();

        // Jika pelanggan ingin membeli, maka akan dikosongkan layar dan lanjut ke tahap pembelian.
        if(beli.equalsIgnoreCase("y") || beli.equalsIgnoreCase("yes")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();

            pembelian();
        }
        
        System.out.println("\n\n\t======= Terima kasih telah berlangganan di SaniVerse =======\n\n");

        // Menutup stream Scanner input.
        input.close();
    }    
}
