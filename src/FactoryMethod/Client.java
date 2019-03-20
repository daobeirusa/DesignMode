package FactoryMethod;
//工厂方法模式
public class Client {
    public static void main(String[] args){
        IFactory factory = new AddFactory();
        Operation operation = factory.CreateOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);
        try {
            double result = operation.getResult();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
