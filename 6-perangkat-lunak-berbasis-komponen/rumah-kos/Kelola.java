import java.util.ArrayList;

public interface Kelola
{
    public boolean tambahPenyewaRumahKos(Penyewa penyewa);
    public ArrayList<Penyewa> getParaPenyewa();
    public boolean isPenyewa(Penyewa penyewa);
    public int getKamarKosong();
    public String toString();
}
