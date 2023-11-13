public class TombolBayar implements Pembayaran
{
    private BayarSewa rumahKos;
    
    public TombolBayar()
    {
        rumahKos = null;
    }
    
    @Override
    public boolean connectTo(Penyewa penyewa, BayarSewa rumahKos)
    {
        this.rumahKos = rumahKos;
        
        if(this.rumahKos.isPenyewa(penyewa)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public boolean pressed(Penyewa penyewa, PembayaranDigital pembayaranDigital, int saldo)
    {
        if(rumahKos.isPenyewa(penyewa)) {
            rumahKos.connectTo(pembayaranDigital);
            
            if(rumahKos.bayarUangSewa(saldo)) {
                return true;
            }
            else {
                return false;
            }
        }
        
        System.out.println("Penyewa tidak ditemukan !");
        return false;
    }
}
