package Observer;

public class Client {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver("观察者A",subject));
        subject.attach(new ConcreteObserver("观察者B",subject));
        subject.attach(new ConcreteObserver("观察者C",subject));

        subject.setSubjectState("running");
        subject.observerNotify();
    }
}
