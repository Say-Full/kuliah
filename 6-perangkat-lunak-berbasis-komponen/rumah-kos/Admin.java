import java.util.ArrayList;
import java.util.Iterator;

public class Admin
{
    private Kelola rumahKos;
    
    public Admin()
    {
        rumahKos = null;
    }
    
    public void connectTo(Kelola rumahKos)
    {
        this.rumahKos = rumahKos;
        System.out.println("Admin berhasil terkoneksi ke aplikasi " + this.rumahKos + " !");
    }
    
    public void cekKamarKosong()
    {
        if(rumahKos == null) {
            System.out.println("Aplikasi tidak terkoneksi !");
            return;
        }
        
        System.out.println("Terdapat " + rumahKos.getKamarKosong() + " kamar yang kosong !");
    }
    
    public void tambahPenyewa(Penyewa penyewa)
    {
        if(rumahKos == null) {
            System.out.println("Aplikasi tidak terkoneksi !");
            return;
        }
        
        if(rumahKos.tambahPenyewaRumahKos(penyewa)) {
            System.out.println(penyewa);
        }
        else {
            System.out.println("Gagal menambahkan penyewa baru !");
        }
    }
    
    public void cekParaPenyewa()
    {
        if(rumahKos == null) {
            System.out.println("Aplikasi tidak terkoneksi !");
            return;
        }
        
        ArrayList<Penyewa> paraPenyewa = rumahKos.getParaPenyewa();
        
        if(paraPenyewa.size() == 0) {
            System.out.println("Belum ada penyewa yang terdaftar !");
            return;
        }
        
        Iterator<Penyewa> itr = paraPenyewa.iterator();
        
        System.out.println("Berikut adalah data penyewa kamar kos :");
        
        while(itr.hasNext()) {
            Penyewa penyewa = itr.next();
            
            System.out.println(penyewa);
        }
    }
    
    public void cekPenyewa(Penyewa penyewa)
    {
        if(rumahKos == null) {
            System.out.println("Aplikasi tidak terkoneksi !");
            return;
        }
        
        if(rumahKos.isPenyewa(penyewa)) {
            System.out.println("Penyewa ditemukan !");
        }
        else {
            System.out.println("Penyewa tidak ditemukan !");
        }
    }
}
