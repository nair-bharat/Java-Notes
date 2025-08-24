package ObserverPattern.AmazonNotify;

import ObserverPattern.AmazonNotify.Observable.IphoneObservableImpl;
import ObserverPattern.AmazonNotify.Observable.StocksObservable;
import ObserverPattern.AmazonNotify.Observer.EmailAlertObserverImpl;
import ObserverPattern.AmazonNotify.Observer.MobileAlertObserverImpl;
import ObserverPattern.AmazonNotify.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abcde", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}


// Notes

/*

The Observer Pattern defines a one-to-many dependency between objects, so that when one object (the Subject) changes state, all its dependents (the Observers) are notified automatically.

👉 Think of it like YouTube:

Subject (Publisher/Channel) = A YouTube channel.

Observers (Subscribers) = People who subscribe.

Whenever the channel uploads a video, all subscribers get notified.


🔹 Structure

Subject (Observable)

    Maintains a list of observers.

    Provides methods to add/remove observers.

    Notifies observers of state changes.

Observer

    Defines an update() method that gets called when Subject changes.


 */