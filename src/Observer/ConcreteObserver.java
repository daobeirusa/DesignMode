package Observer;

public class ConcreteObserver extends Observer{
    private String name;
    private ConcreteSubject subject;
    private String observerState;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        this.observerState = this.subject.getSubjectState();
        System.out.println("观察者"+name+"的状态是"+observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
