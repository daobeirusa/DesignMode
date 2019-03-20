package FactoryMethod;

public class MulFactory implements IFactory{
    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }
}
