public class Penyewa
{
    private String nama;
    private String nomorHp;
    private String nomorKamar;
    private Pembayaran tombolBayar;
    private final int SALDO = 900000;

    public Penyewa(String nama, String nomorHp, String nomorKamar)
    {
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.nomorKamar = nomorKamar;
        tombolBayar = null;
    }
    
    public void connectTo(Pembayaran tombolBayar)
    {
        this.tombolBayar = tombolBayar;
    }
    
    public void bayarUangSewa(BayarSewa rumahKos, PembayaranDigital pembayaranDigital)
    {
        if(tombolBayar.connectTo(this, rumahKos)) {
            System.out.println(nama + " berhasil terkoneksi ke tombol bayar !");
        }
        else {
            System.out.println("Anda gagal terkoneksi ke tombol bayar karena tidak terdaftar di aplikasi " + rumahKos + " !");
            return;
        }
        
        if(tombolBayar.pressed(this, pembayaranDigital, SALDO)) {
            System.out.println(nama + " berhasil membayar uang sewa seharga Rp. " + rumahKos.getBiayaSewa() + " !");
        }
        else {
            System.out.println(nama + " gagal membayar uang sewa ! Periksa saldo di dalam rekening Anda !");
        }
    }

    public String toString()
    {
        return "Kamar " + nomorKamar + " -> " + nama + " (No HP : " + nomorHp + ")";
    }
}
