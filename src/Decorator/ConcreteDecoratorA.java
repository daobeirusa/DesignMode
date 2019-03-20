package Decorator;

public class ConcreteDecoratorA extends Decorator{
    private String addedState;

    public ConcreteDecoratorA(){}

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void Operation(){
        super.Operation();
        addedState = "具体装饰对象A的操作";
        System.out.println(addedState);
    }
}
