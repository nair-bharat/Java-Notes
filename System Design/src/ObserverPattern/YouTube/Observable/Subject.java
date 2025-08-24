package ObserverPattern.YouTube.Observable;

import ObserverPattern.YouTube.Observer.Observer;

public interface Subject {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifySubscribers(String message);

    public void uploadVideo(String title);

}
