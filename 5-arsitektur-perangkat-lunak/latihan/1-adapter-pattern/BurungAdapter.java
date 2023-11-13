public class BurungAdapter implements BebekMainan
{
    private Burung burung;

    public BurungAdapter(Burung burung)
    {
        this.burung = burung;
    }

    @Override
    public void kwek()
    {
        burung.suara();
    }
}
