
import java.util.Scanner;

/**
 * Class MainLompatKatak adalah class utama dimana terdapat method main.
 *
 * @author Muhammad Saifullah Sani
 * @NPM 1908107010062
 * @version 25/11/2020
 */
public class MainLompatKatak
{
    private boolean play;

    /**
     * Constructor untuk class MainLompatKatak
     */
    public MainLompatKatak()
    {
        play = true;
    }
    
    /**
     * Mendapatkan posisi katak dalam nilai angka
     */
    public static int kunciJawaban(int baris, int kolom, int indeksTerakhir)
    {
        int[][] batu = new int[indeksTerakhir][indeksTerakhir];
        int nilai = 1;

        //Mengisi nilai kedalam array batu
        for(int i = 0; i < indeksTerakhir; i++) {
            for(int j = 0; j < indeksTerakhir; j++) {
                batu[i][j] = nilai;
                nilai++;
            }
        }      
        return batu[baris][kolom];
    }

    /**
     * Memberikan bantuan permainan
     */
    public static void bantuan(int batuTerakhir, int jawaban)
    {
        System.out.println("\n   | ============================== BANTUAN ============================== |");
        System.out.println("   |                                                                       |");

        if(batuTerakhir == 25 ) {
            if(jawaban >= 13) {
                System.out.println("   |  Katak diperkirakan berada di atas batu yang bernomor lebih dari 12   |");
            }
            else {
                System.out.println("   |  Katak diperkirakan berada di atas batu yang bernomor kurang dari 13  |");
            }
        }
        else if(batuTerakhir == 100) {
            if(jawaban >= 51) {
                System.out.println("   |  Katak diperkirakan berada di atas batu yang bernomor lebih dari 50   |");
            }
            else {
                System.out.println("   |  Katak diperkirakan berada di atas batu yang bernomor kurang dari 51  |");
            }
        }
        else {
            if(jawaban >= 113) {
                System.out.println("   |  Katak diperkirakan berada di atas batu yang bernomor lebih dari 112  |");
            }
            else {
                System.out.println("   |  Katak diperkirakan berada di atas batu yang bernomor kurang dari 113 |");
            }
        }
        System.out.println("   |_______________________________________________________________________|");
    }

    /**
     * Membaca tebakan pemain
     */
    public static int tebak(int batuTerakhir, int jawaban)
    {
       Scanner in = new Scanner(System.in);
       int tebakan = 0;
       
       System.out.print("Masukkan tebakan : ");
       tebakan = in.nextInt();

       //Exception handling ketika pemain tidak meminta bantuan atau menebak diluar batas nomor batu
       while(tebakan < 0 || tebakan > batuTerakhir) {
        System.out.println("\n\t====================== INPUT TIDAK VALID ======================\n\nMohon input bilangan bulat pada rentang 0-" + batuTerakhir + "\n");
        System.out.print("Masukkan tebakan : ");
        tebakan = in.nextInt();
        }

       while(tebakan == 0) {
           bantuan(batuTerakhir, jawaban);
           System.out.print("\n\nMasukkan tebakan : ");
           tebakan = in.nextInt();
       }
       in.close();
       return tebakan;
    }
    
    /**
     * Mengonversi tebakan user yang berupa angka menjadi baris dan kolom
     */
    public static int posisiKatak(int indeksTerakhir, int tebakan, int posisiBarisKolom)
    {
        int[][] batu = new int[indeksTerakhir][indeksTerakhir];
        int nilai = 1;
      
        for(int baris = 0; baris < indeksTerakhir; baris++) {
            for(int kolom = 0; kolom < indeksTerakhir; kolom++) {
                batu[baris][kolom] = nilai;
                nilai++;
                
                if(tebakan == batu[baris][kolom]) {
                    if(posisiBarisKolom == 0) {
                        return baris;
                    }
                    else {
                        return kolom;
                    }
                }
            }
        }        
        return 0;
    }
    
    /**
     * Ketika tebakan pemain salah, akan diberikan sedikit petunjuk
     */
    public static void tidakAdaKatak(int tebakan, int jawaban)
    {
        if(tebakan < jawaban) {
            System.out.println("Belum benar !\nTebakan Anda lebih kecil dari jawabannya !");
        }
        else {
            System.out.println("Belum benar !\nTebakan Anda lebih besar dari jawabannya !");
        }
    }
    
    /**
     * Permainan level easy yang bermain dengan 25 batu
     */
    public static int easy()
    {
        int skor = 0;
        int percobaan = 1;
        Danau danau1 = new Danau();
        
        //Memberikan posisi awal si katak
        int baris = (int) (Math.random() * 4);
        int kolom = (int) (Math.random() * 4);
        danau1.tambahKatak(baris, kolom);
        int jawaban = kunciJawaban(baris, kolom, 5);
    
        //Pemain diberikan kesempatan menebak sebanyak 20 kali
        while(percobaan <= 20) {
            int tebakan = tebak(25, jawaban);

            //Jika tebakan pemain benar, pemain mendapatkan 10 poin dan posisi katak diacak
            if(danau1.adaKatak(posisiKatak(5, tebakan, 0), posisiKatak(5, tebakan, 1)) == true) {
                System.out.println("~~~ Selamat Anda benar ~~~");
                skor += 10;
                danau1.hapusKatak(baris, kolom);
                baris = (int) (Math.random() * 4);
                kolom = (int) (Math.random() * 4);
                danau1.tambahKatak(baris, kolom);
                jawaban = kunciJawaban(baris, kolom, 5);
            }
            else {
                tidakAdaKatak(tebakan, jawaban);
            }
            percobaan++;
            System.out.println();
        }
        return skor;
    }

    /**
     * Permainan level intermediate yang bermain dengan 100 batu
     */
    public static int intermediate()
    {
        int skor = 0;
        int percobaan = 1;
        Danau danau2 = new Danau(10);

        //Memberikan posisi awal si katak
        int baris = (int) (Math.random() * 9);
        int kolom = (int) (Math.random() * 9);
        danau2.tambahKatak(baris, kolom);
        int jawaban = kunciJawaban(baris, kolom, 10);
 
        //Pemain diberikan kesempatan menebak sebanyak 20 kali
        while(percobaan <= 20) {
            int tebakan = tebak(100, jawaban);
 
            //Jika tebakan pemain benar, pemain mendapatkan 10 poin dan posisi katak diacak
            if(danau2.adaKatak(posisiKatak(10, tebakan, 0), posisiKatak(10, tebakan, 1)) == true) {
                System.out.println("~~~ Selamat Anda benar ~~~");
                skor += 10;
                danau2.hapusKatak(baris, kolom);
                baris = (int) (Math.random() * 9);
                kolom = (int) (Math.random() * 9);
                danau2.tambahKatak(baris, kolom);
                jawaban = kunciJawaban(baris, kolom, 10);
            } 
            else {
                tidakAdaKatak(tebakan, jawaban);
            }          
            percobaan++;
            System.out.println();
        }  
        return skor;
    }

    /**
     * Permainan level difficult yang bermain dengan 225 batu
     */
    public static int difficult()
    {
        int skor = 0;
        int percobaan = 1;
        Danau danau3 = new Danau(15);

        //Memberikan posisi awal si katak
        int baris = (int) (Math.random() * 14);
        int kolom = (int) (Math.random() * 14);
        danau3.tambahKatak(baris, kolom);
        int jawaban = kunciJawaban(baris, kolom, 15);
 
        //Pemain diberikan kesempatan menebak sebanyak 20 kali
        while(percobaan <= 20) {
            int tebakan = tebak(225, jawaban);
 
            //Jika tebakan pemain benar, pemain mendapatkan 10 poin dan posisi katak diacak
            if(danau3.adaKatak(posisiKatak(15, tebakan, 0), posisiKatak(15, tebakan, 1)) == true) {
                System.out.println("~~~ Selamat Anda benar ~~~");
                skor += 10;
                danau3.hapusKatak(baris, kolom);
                baris = (int) (Math.random() * 14);
                kolom = (int) (Math.random() * 14);
                danau3.tambahKatak(baris, kolom);
                jawaban = kunciJawaban(baris, kolom, 15);
            }
            else {
                tidakAdaKatak(tebakan, jawaban);
            }
            percobaan++;
            System.out.println();
        }
        return skor;
    }

    /**
     * Method untuk memainkan permainan
     */
    public void mainkan()
    {
        Scanner in = new Scanner(System.in); 
        int pilihan = 1;
        int ulang = 0;
        
        
        System.out.println("\n\t\t\t\t\t=============== Lompat si Katak Lompat, Lompat ! ===============\n\n");
        System.out.print("Masukkan nama Anda : "); 
        String nama = in.nextLine();
        Pemain p = new Pemain(nama);
        System.out.println("\nHai " + p.getNama() + " !\nSelamat menikmati permainan ini !\n\n");        
        
        while(play == true) {
            int total = 0;
            
            if(ulang > 0) {
                System.out.print("\nApakah Anda ingin mengubah nama Anda di dalam game ini (y/n) ? ");
                char name = in.next().charAt(0);
                
                while(!(name == 'y' || name == 'Y' || name == 'n' || name == 'N')) {
                    System.out.println("\n\n\t====================== INPUT TIDAK VALID ======================\n\nMohon input \"y\" atau \"n\" !\n");
                    System.out.print("Apakah Anda ingin mengubah nama Anda di dalam game ini (y/n) ? ");
                    name = in.next().charAt(0);
                }
                                
                if(name == 'y' || name == 'Y') {
                    Scanner in2 = new Scanner(System.in); 
                    
                    System.out.print("\n\nMasukkan nama Anda : "); 
                    nama = in2.nextLine();
                    p.setNama(nama);
                    System.out.println("\nHai " + p.getNama() + " !\nSelamat menikmati permainan ini !\n\n");
                }                
            }
            
            //Pilih level permainan
            System.out.println("\nLevel :\n1. Easy\n2. Intermediate\n3. Difficult");
            System.out.print("Pilih level : ");
            int level = in.nextInt();
            
            //Exception handling ketika pemain memilih selain pilihan yang diberikan
            while(level != 1 && level != 2 && level != 3) {
                System.out.println("\n\t====================== INPUT TIDAK VALID ======================\n\nMohon input bilangan bulat pada rentang 1-3\n");
                System.out.println("Level :\n1. Easy\n2. Intermediate\n3. Difficult");
                System.out.print("Pilih level : ");
                level = in.nextInt();
            }

            System.out.println();

            //Menjalankan permainan sesuai level yang pemain pilih
            if(level == 1) {
                System.out.println("\n      ========================== PERMAINAN LEVEL EASY ============================\n");
                System.out.println("Petunjuk :\nKatak berada di atas batu bernomor antara 1 sampai 25 !");
                System.out.println("Anda diberi kesempatan menebak sebanyak 20 kali !");
                System.out.println("Silahkan Anda tebak atau Anda dapat memilih bantuan dengan cara memasukkan angka 0 !\n");
                p.setNilai(easy());
            }
            else if(level == 2) {
                System.out.println("\n      ======================= PERMAINAN LEVEL INTERMEDIATE =========================\n");
                System.out.println("Petunjuk :\nKatak berada di atas batu bernomor antara 1 sampai 100 !");
                System.out.println("Anda diberi kesempatan menebak sebanyak 20 kali !");
                System.out.println("Silahkan Anda tebak atau Anda dapat memilih bantuan dengan cara memasukkan angka 0 !\n");
                p.setNilai(intermediate());
            }
            else {
                System.out.println("\n      ======================== PERMAINAN LEVEL DIFFICULT ==========================\n");
                System.out.println("Petunjuk :\nKatak berada di atas batu bernomor antara 1 sampai 225 !");
                System.out.println("Anda diberi kesempatan menebak sebanyak 20 kali !");
                System.out.println("Silahkan Anda tebak atau Anda dapat memilih bantuan dengan cara memasukkan angka 0 !\n");
                p.setNilai(difficult());
            }

            System.out.println("\n\t====================== KESEMPATAN ANDA TELAH HABIS ======================\n");

            //Mencetak komentar setelah pemain selesai bermain
            if(p.getNilai() > 100) {
                System.out.println("Skor total : " + p.getNilai() + "\nLuar biasa !\nTebakan Anda sangat akurat !");
            }
            else if(p.getNilai() >= 50 && p.getNilai() <= 100) {
                System.out.println("Skor total : " + p.getNilai() + "\nSangat bagus !\nTebakan Anda di atas rata-rata !");
            }
            else {
                System.out.println("Skor total : " + p.getNilai() + "\nAnda kurang beruntung. Silahkan coba lagi !");
            }

            System.out.print("\n\nApakah Anda ingin bermain lagi ? (1/0)\t: ");
            pilihan = in.nextInt();

            //Exception handling ketika pemain memilih selain pilihan yang diberikan
            while(pilihan != 0 && pilihan != 1) {
                System.out.println("\n\t====================== INPUT TIDAK VALID ======================\n\nMohon pilih antara 1 atau 0\n");
                System.out.print("Apakah Anda ingin bermain lagi ? (1/0) : ");
                pilihan = in.nextInt();
            }
            
            if(pilihan == 0) {
                play = false;
            }
            else {
                play = true;
                ulang = 1;
            }
        }
        System.out.println("\nThank You !\nStay awesome !\n");
        in.close();
    }

    /**
     * Method utama (main) untuk menjalankan permainan
     */
    public static void main(String[] a)
    {
        MainLompatKatak main = new MainLompatKatak();
        main.mainkan();
    }
}