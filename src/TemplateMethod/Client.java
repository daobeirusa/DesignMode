package TemplateMethod;

//模板方法模式
public class Client {
    public static void main(String[] args){
        ConcreteClassA mA = new ConcreteClassA();
        ConcreteClassB mB = new ConcreteClassB();
        mA.TemplateMethod();
        mB.TemplateMethod();
    }
}
