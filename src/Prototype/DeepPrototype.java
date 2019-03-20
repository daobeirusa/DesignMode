package Prototype;

public class DeepPrototype implements Cloneable{
    public People person;

    public DeepPrototype(People person) {
        this.person = person;
    }

    public void setPerson(People person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "person=" + person.toString() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepPrototype clone = (DeepPrototype)super.clone();
        clone.setPerson((People) this.person.clone());
        return clone;
    }
}
