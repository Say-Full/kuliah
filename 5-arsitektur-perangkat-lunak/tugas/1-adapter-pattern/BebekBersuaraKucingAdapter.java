public class BebekBersuaraKucingAdapter implements Bebek
{
    private Kucing kucing;

    public BebekBersuaraKucingAdapter(Kucing kucing)
    {
        this.kucing = kucing;
    }

    @Override
    public void kwek()
    {
        kucing.suara();
    }
}
