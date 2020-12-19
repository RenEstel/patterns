package ren.estel.observer;

public class ObserverImpl implements Observer {

    private Subject subject;

    public ObserverImpl(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Change status");
    }
}
