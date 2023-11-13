public interface Pembayaran
{
    public boolean connectTo(Penyewa penyewa, BayarSewa rumahKos);
    public boolean pressed(Penyewa penyewa, PembayaranDigital pembayaranDigital, int saldo);
}
