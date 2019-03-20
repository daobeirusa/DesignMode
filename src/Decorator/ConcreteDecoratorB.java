package Decorator;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(){}

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void Operation(){
        super.Operation();
        myBehavior();
    }

    private void myBehavior(){
        System.out.println("具体装饰对象B的操作");
    }
}
