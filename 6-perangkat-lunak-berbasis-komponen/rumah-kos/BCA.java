public class BCA implements PembayaranDigital
{    
    @Override
    public boolean bayar(int saldo, int biaya)
    {
        if(saldo - biaya < 0) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString()
    {
        return "BCA";
    }
}
