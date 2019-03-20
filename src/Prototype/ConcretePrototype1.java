package Prototype;

public class ConcretePrototype1 extends Prototype{
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
