public class Utama
{
    public static void main(String[] args)
    {
        Merpati merpati = new Merpati();
        merpati.suara();
        merpati.terbang();

        System.out.println();

        BebekPlastik bebekPlastik = new BebekPlastik();
        bebekPlastik.kwek();

        System.out.println();

        // bebekMainanRekayasa yang memiliki suara Burung merpati
        BurungAdapter bebekMainanRekayasa = new BurungAdapter(merpati);
        bebekMainanRekayasa.kwek();
    }
}
