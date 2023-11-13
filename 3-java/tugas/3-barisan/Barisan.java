
/**
 * Kelas abstrak Barisan adalah kelas yang menjadi superclass yang memiliki method abstrak.
 *
 * @author Muhammad Saifullah Sani
 * @version 06-12-2020
 */
public abstract class Barisan
{
    protected int nilaiBerikutnya;

    /**
     * Method constructor yang memberikan nilai awal atribut nilaiBerikutnya bernilai 0 dan mencetak nilai tersebut.
     */
    public Barisan()
    {
        nilaiBerikutnya = 0;
        System.out.print(this.nilaiBerikutnya + " ");
    }
    
    /**
     * Method constructor yang memberikan nilai awal atribut nilaiBerikutnya sesuai dengan nilai parameternya dan mencetak nilai tersebut.
     * @param nilaiAwal nilai yang akan dijadikan nilai atribut nilaiBerikutnya.
     */
    public Barisan(int nilaiAwal)
    {
        this.nilaiBerikutnya = nilaiAwal;
        System.out.print(this.nilaiBerikutnya + " ");
    }
    
    /**
     * Method yang mengolah nilai atribut nilaiBerikutnya tergantung method naik dalam child class. Method ini akan mengembalikan nilai atribut nilaiBerikutnya yang telah diolah.
     * @return nilaiBerikutnya yang sudah diolah dari method naik dalam childclass.
     */
    public int berikutnya()
    {
        naik();
        return this.nilaiBerikutnya;
    }
    
    /**
     * Method abstract.
     */
    public abstract void naik();
}
