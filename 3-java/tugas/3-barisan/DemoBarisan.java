
/**
 * Kelas DemoBarisan berguna untuk menjalankan program dengan cara membuat objek dan mengecek class-class yang telah dibuat.
 *
 * @author Muhammad Saifullah Sani
 * @version 06-12-2020
 */
public class DemoBarisan
{
    /**
     * Method constructor kosong.
     */
    public DemoBarisan()
    {
        
    }

    /**
     * Method untuk mencetak 20 nilai matematis yang terurut sesuai barisan tertentu.
     * @param objek objek dari class yang akan diolah.
     */
    public void cetakUrutan20(Object objek)
    {
        for(int i = 1; i < 20; i++) {
            System.out.print(objek);
        }
        System.out.println();
    }
    
    /**
     * Method utama untuk menjalankan program.
     * @param arg argumen CLA yang tidak digunakan.
     */
    public static void main(String[] arg)
    {
        DemoBarisan db = new DemoBarisan();
        db.cetakUrutan20(new BarisanAritmetika(-30, 5));
        db.cetakUrutan20(new BarisanGeometri(1, 2));
        db.cetakUrutan20(new BarisanFibonacci());
        db.cetakUrutan20(new BarisanPangkat(2));
    }
}
