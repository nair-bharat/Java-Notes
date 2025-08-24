package ObserverPattern.YouTube;

import ObserverPattern.YouTube.Observable.Subject;
import ObserverPattern.YouTube.Observable.YouTubeChannel;
import ObserverPattern.YouTube.Observer.Observer;
import ObserverPattern.YouTube.Observer.Subscriber;

public class Demo {

    public static void main(String[] args) {

        Subject subjectYT = new YouTubeChannel();

        Observer subscriber1 = new Subscriber("Bharat");
        Observer subscriber2 = new Subscriber("Bhavya");

        subjectYT.add(subscriber1);
        subjectYT.add(subscriber2);

        subjectYT.uploadVideo("New Movie 1");

    }
}
