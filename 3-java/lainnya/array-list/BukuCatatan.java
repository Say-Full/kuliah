import java.util.ArrayList;
/**
 * Write a description of class BukuCatatan here.
 *
 * @author Muhammad Saifullah Sani
 * @version 23/11/2020
 */
public class BukuCatatan
{
    //private String tanggalBuat;
    //private String judul;
    private ArrayList<String> catatan;

    /**
     * Constructor for objects of class BukuCatatan
     */
    public BukuCatatan()
    {
        catatan = new ArrayList<>();
    }
    
    public void tambahCatatan(String isi)
    {
        catatan.add(isi);
    }
    
    public String hapusCatatan(int indeks)
    {
        if(indeks >= 0 && indeks < jumlahCatatan()) {
            catatan.remove(indeks);
            return "Proses menghapus berhasil !";
        }
        else {
            return "Proses menghapus gagal !";
        }
    }
    
    public void hapusCatatan(String isi)
    {
        catatan.remove(isi);
    }
    
    public String ubahCatatan(int indeks, String dataBaru)
    {
        if(indeks >= 0 && indeks < jumlahCatatan()) {
            catatan.set(indeks, dataBaru);
            return "Proses mengubah berhasil !";
        }
        else {
            return "Proses mengubah gagal !";
        }
    }
    
    public String bacaCatatan(int indeks)
    {
        if(indeks >= 0 && indeks < jumlahCatatan()) {
            return catatan.get(indeks);
        }
        else {
            return "Proses membaca gagal !";
        }
    }
    
    public int jumlahCatatan()
    {
        return catatan.size();
    }
    
    public void tampilSemuaCatatan()
    {
        for(String a : catatan) {
            System.out.println(a);
        }
    }
}
