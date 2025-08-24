package ObserverPattern.YouTube.Observable;

import ObserverPattern.YouTube.Observer.Observer;
import ObserverPattern.YouTube.Observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    List<Observer> subscriberList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        subscriberList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        subscriberList.remove(observer);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Observer observer : subscriberList) {
            observer.update(message);
        }
    }

    @Override
    public void uploadVideo(String title) {
        notifySubscribers("New video uploaded with Title: " + title);
    }
}
