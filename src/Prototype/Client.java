package Prototype;

//原型模式
public class Client {
    public static void main(String[] args){
/*        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        try {
            ConcretePrototype1 c1 = (ConcretePrototype1) p1.Clone();
            System.out.println("Clone:"+c1.getId());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

        DeepPrototype d1 = new DeepPrototype(new People(17,"Haruhi"));
        try {
            DeepPrototype d2 = (DeepPrototype) d1.clone();
            d2.person.setName("Asahina");
            System.out.println(d1);
            System.out.println(d2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
