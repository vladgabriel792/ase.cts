package observer;

public class SubscriberB implements ISubscriber{
    @Override
    public void act() {
        System.out.println("close the window");
    }
}
