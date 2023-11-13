public class NewsChannel implements Observer {
    private NewsAgency newsAgency;

    public NewsChannel(NewsAgency newsAgency) {
        this.newsAgency = newsAgency;
    }

    @Override
    public void update() {
        System.out.println("Berita baru : "+newsAgency.getNews());
    }
}