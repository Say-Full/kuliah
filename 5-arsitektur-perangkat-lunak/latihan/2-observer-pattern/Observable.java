import java.util.ArrayList;

public abstract class Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    String news;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getNews() {
        return this.news;
    }

    public void setNews(String news) {
        this.news = news;
        this.notify();
    }

    public abstract void notify();
}