import java.util.Scanner;

public class tebakNilai
{ 
    public static void main(String arg[])
    {
        double x = 0*(1.0 - Math.random()/Math.nextDown(1.0)) + 10000*Math.random()/Math.nextDown(1.0);
        int jawaban = (int) x;
        int tebakan = 0;
        Scanner tebak = new Scanner(System.in);
        int i=0;
        String[] kata = {"Tetap berusaha", "Belum benar ni", "Coba yang lain", "Belum tepat dong"};


        System.out.println(jawaban);
        System.out.println("Saya adalah nilai diantara 1 hingga 10.000\nDapatkah anda menebaknya ?\n");

        while(true)
        {
            System.out.print("Masukkan tebakan anda : ");
            tebakan = tebak.nextInt();

            if(tebakan == jawaban)
            {
                System.out.println("Kerennn!\nKamu telah mencoba " + i + " kali\n");
                break;
            }
            else if(tebakan > jawaban)
            {
                double z = 0*(1.0 - Math.random()/Math.nextDown(1.0)) + 3*Math.random()/Math.nextDown(1.0);
                int in = (int) z;
                System.out.println("Terlalu besar\n" + kata[in] + "\n");
            }
            else if(tebakan < jawaban)
            {
                double z = 0*(1.0 - Math.random()/Math.nextDown(1.0)) + 3*Math.random()/Math.nextDown(1.0);
                int in = (int) z;
                System.out.println("Terlalu kecil\n" + kata[in] + "\n");
            }

            
            i++;
        }
        in.close();
    }
}
