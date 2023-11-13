public class NewsAgency extends Observable {

    public void notifikasi() {
        for (Observer newsAgency : observers) {
            newsAgency.update();
        }
    }
}