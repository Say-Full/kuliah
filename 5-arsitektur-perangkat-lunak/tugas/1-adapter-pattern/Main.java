public class Main
{
    public static void main(String[] args)
    {
        Kucing cicing = new KucingAnggora();
        cicing.suara();

        Bebek ayle = new BebekAylesbury();
        ayle.kwek();

        Bebek aylecing = new BebekBersuaraKucingAdapter(cicing);
        aylecing.kwek();
    }    
}

