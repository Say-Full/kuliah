import java.util.Scanner;
    
/**
* Permainan Lompat si Katak, Lompat !
* Permainan ini bertujuan untuk menebak posisi seekor katak yang meloncat
* secara acak di atas batu yang tersusun dalam bentuk larik di danau
* yang diberi nomor sesuai dengan level permainan. 
* 
* 
* @author Muhammad Saifullah Sani
* @version 2020.10.30
*/
    
public class Tugas1
{ 
    public Tugas1()
    {
        
    }
    
    /**
     * Terdapat 25 batu pada level easy
     */
    public static int easy()
    {
        Scanner in = new Scanner(System.in);
        int skor = 0;
        int tebakan = 0;
        int percobaan = 1;
        int[][] batu = new int[5][5];
        int nilai = 1;
        
        //Mengisi nilai kedalam array batu
        for(int i = 0; i <= 4; i++) {
            for(int j = 0; j <= 4; j++) {
                batu[i][j] = nilai;
                nilai++;
            }
        }
        
        int baris = (int) (0 + Math.random() * (4 - 0));
        int kolom = (int) (0 + Math.random() * (4 - 0));
    
        //Pemain diberikan kesempatan menebak sebanyak 20 kali
        while (percobaan <= 20) {
            System.out.print("Masukkan tebakan : ");
            tebakan = in.nextInt();

            //Error handling ketika pemain menebak diluar batas nomor batu
            while (tebakan < 1 || tebakan > 25) {
                System.out.println("\n\t====================== INPUT TIDAK VALID ======================\n\nMohon input bilangan bulat pada rentang 1-25\n");
                System.out.print("Masukkan tebakan : ");
                tebakan = in.nextInt();
            }

            //Jika tebakan pemain benar, pemain mendapatkan 10 poin dan posisi katak diacak
            if(tebakan == batu[baris][kolom]) {
                System.out.println("~~~ Selamat Anda benar ~~~");
                skor += 10;
                baris = (int) (0 + Math.random() * (4 - 0));
                kolom = (int) (0 + Math.random() * (4 - 0));
            }
            percobaan++;
            System.out.println();
        }
        return skor;
    }

    /**
     * Terdapat 100 batu pada level intermediate
     */
    public static int intermediate()
    {
        Scanner in = new Scanner(System.in);
        int skor = 0;
        int tebakan = 0;
        int percobaan = 1;
        int[][] batu = new int[10][10];
        int nilai = 1;

        //Mengisi nilai kedalam array batu
        for(int i = 0; i <= 9; i++) {
            for(int j = 0; j <= 9; j++) {
                batu[i][j] = nilai;
                nilai++;
            }
        }

        int baris = (int) (0 + Math.random() * (9 - 0));
        int kolom = (int) (0 + Math.random() * (9 - 0));
 
        //Pemain diberikan kesempatan menebak sebanyak 20 kali
        while (percobaan <= 20) {
            System.out.print("Masukkan tebakan : ");
            tebakan = in.nextInt();
 
            //Error handling ketika pemain menebak diluar batas nomor batu
            while (tebakan < 1 || tebakan > 100) {
                System.out.println("\n\t====================== INPUT TIDAK VALID ======================\n\nMohon input bilangan bulat pada rentang 1-100\n");
                System.out.print("Masukkan tebakan : ");
                tebakan = in.nextInt();
            }
 
            //Jika tebakan pemain benar, pemain mendapatkan 10 poin dan posisi katak diacak
            if(tebakan == batu[baris][kolom]) {
                System.out.println("~~~ Selamat Anda benar ~~~");
                skor += 10;
                baris = (int) (0 + Math.random() * (9 - 0));
                kolom = (int) (0 + Math.random() * (9 - 0));
            }
            percobaan++;
            System.out.println();
        }  
        return skor;
    }

    /**
     * Terdapat 225 batu pada level difficult
     */
    public static int difficult()
    {
        Scanner in = new Scanner(System.in);
        int skor = 0;
        int tebakan = 0;
        int percobaan = 1;
        int[][] batu = new int[15][15];
        int nilai = 1;

        //Mengisi nilai kedalam array batu
        for(int i = 0; i <= 14; i++) {
            for(int j = 0; j <= 14; j++) {
                batu[i][j] = nilai;
                nilai++;
            }
        }

        int baris = (int) (0 + Math.random() * (14 - 0));
        int kolom = (int) (0 + Math.random() * (14 - 0));
 
        //Pemain diberikan kesempatan menebak sebanyak 20 kali
        while (percobaan <= 20) {
            System.out.print("Masukkan tebakan : ");
            tebakan = in.nextInt();
 
            //Error handling ketika pemain menebak diluar batas nomor batu
            while (tebakan < 1 || tebakan > 225) {
                System.out.println("\n\t====================== INPUT TIDAK VALID ======================\n\nMohon input bilangan bulat pada rentang 1-225\n");
                System.out.print("Masukkan tebakan : ");
                tebakan = in.nextInt();
            }
 
            //Jika tebakan pemain benar, pemain mendapatkan 10 poin dan posisi katak diacak
            if(tebakan == batu[baris][kolom]) {
                System.out.println("~~~ Selamat Anda benar ~~~");
                skor += 10;
                baris = (int) (0 + Math.random() * (14 - 0));
                kolom = (int) (0 + Math.random() * (14 - 0));
            }
            percobaan++;
            System.out.println();
        }
        return skor;
    }

    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        int pilihan=1;

        while (pilihan == 1) {
            int total = 0;
            System.out.println("\nLevel :\n1. Easy\n2. Intermediate\n3. Difficult");
            System.out.print("Pilih level : ");
            int level = in.nextInt();
            
            //Error handling ketika pemain memilih selain pilihan yang diberikan
            while (level < 1 || level > 3) {
                System.out.println("\n\t====================== INPUT TIDAK VALID ======================\n\nMohon input bilangan bulat pada rentang 1-3\n");
                System.out.println("Level :\n1. Easy\n2. Intermediate\n3. Difficult");
                System.out.print("Pilih level : ");
                level = in.nextInt();
            }

            System.out.println();

            //Menjalankan permainan sesuai level yang pemain pilih
            if(level == 1) {
                System.out.println("Katak berada diatas batu bernomor antara 1 sampai 25 !\nSilahkan ditebak !\n");
                total = easy();
            }
            else if(level == 2) {
                System.out.println("Katak berada diatas batu bernomor antara 1 sampai 100 !\nSilahkan ditebak !\n");
                total = intermediate();
            }
            else if(level == 3) {
              System.out.println("Katak berada diatas batu bernomor antara 1 sampai 225 !\nSilahkan ditebak !\n");
              total = difficult();
            }

            //Mencetak komentar setelah pemain selesai bermain
            if(total >= 100) {
                System.out.println("Luar biasa !\nTebakan Anda sangat akurat !");
            }
            else if(total >= 50 && total < 100) {
                System.out.println("Sangat bagus !\nTebakan Anda di atas rata-rata !");
            }
            else {
                System.out.println("Anda kurang beruntung. Silahkan coba lagi !");
            }

            System.out.print("\n\nApakah Anda ingin bermain lagi ? [1/0]\t: ");
            pilihan = in.nextInt();

            //Error handling ketika pemain memilih selain pilihan yang diberikan
            while (pilihan < 0 || pilihan > 1) {
                System.out.println("\n\t====================== INPUT TIDAK VALID ======================\n\nMohon pilih antara 1 atau 0\n");
                System.out.print("Apakah Anda ingin bermain lagi ? [1/0]\t: ");
                pilihan = in.nextInt();
            }
        }
        in.close();
        System.out.println("\nThank You !\nStay awesome !\n");
    }
}
