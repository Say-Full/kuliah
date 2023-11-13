public interface BayarSewa
{
    public int getBiayaSewa();
    public boolean isPenyewa(Penyewa penyewa);
    public void connectTo(PembayaranDigital pembayaranDigital);
    public boolean bayarUangSewa(int saldo);
}
