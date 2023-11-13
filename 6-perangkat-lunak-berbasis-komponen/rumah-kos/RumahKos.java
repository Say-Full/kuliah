import java.util.ArrayList;

public class RumahKos implements Kelola, BayarSewa
{
    private final int JUMLAH_KAMAR = 10;
    private final int BIAYA_SEWA = 800000;
    private ArrayList<Penyewa> paraPenyewa;
    private PembayaranDigital pembayaranDigital;
    
    public RumahKos()
    {
        paraPenyewa = new ArrayList<>(JUMLAH_KAMAR);
        pembayaranDigital = null;
    }
    
    public int getJumlahKamar()
    {
        return JUMLAH_KAMAR;
    }

    @Override
    public boolean tambahPenyewaRumahKos(Penyewa penyewa)
    {
        if(paraPenyewa.size() == JUMLAH_KAMAR) {
            System.out.print("Maaf, semua kamar sudah terisi ! ");
            return false;
        }
        
        paraPenyewa.add(penyewa);
        return true;
    }
    
    @Override
    public ArrayList<Penyewa> getParaPenyewa()
    {
        return paraPenyewa;
    }
    
    @Override
    public boolean isPenyewa(Penyewa penyewa)
    {
        if(paraPenyewa.contains(penyewa)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public int getKamarKosong()
    {
        return JUMLAH_KAMAR - paraPenyewa.size();
    }
    
    @Override
    public int getBiayaSewa()
    {
        return BIAYA_SEWA;
    }

    @Override
    public void connectTo(PembayaranDigital pembayaranDigital)
    {
        this.pembayaranDigital = pembayaranDigital;
        System.out.println("Aplikasi berhasil terkoneksi ke " + this.pembayaranDigital + " !");
    }
    
    @Override
    public boolean bayarUangSewa(int saldo)
    {
        if(pembayaranDigital == null) {
            System.out.println("API pembayaran digital tidak terkoneksi !");
            return false;
        }
        
        if(pembayaranDigital.bayar(saldo, BIAYA_SEWA)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public String toString()
    {
        return "SunFull";
    }
}
