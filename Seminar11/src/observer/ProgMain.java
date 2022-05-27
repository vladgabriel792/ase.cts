package observer;

public class ProgMain {


    public static void main(String[] args) {
        Event event = new Event();

        ISubscriber vlad = new SubscriberA();
        ISubscriber radu = new SubscriberB();

        event.addObserver(vlad);
        event.addObserver(radu);

        event.publicateEvent();
    }
}
