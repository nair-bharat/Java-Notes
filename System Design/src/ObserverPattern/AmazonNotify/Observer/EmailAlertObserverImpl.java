package ObserverPattern.AmazonNotify.Observer;

import ObserverPattern.AmazonNotify.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock, hurry up!");
    }

    public void sendMail(String emailId, String msg) {
        System.out.println("mail sent to: " + emailId);
    }

}
