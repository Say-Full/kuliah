class Main {
    public static void main (String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Observer tvOne = new NewsChannel(newsAgency);
        Observer cnn = new NewsChannel(newsAgency);

        newsAgency.addObserver(tvOne);
        newsAgency.addObserver(cnn);

        newsAgency.setNews("Berita GP Mandalika");
    }
}