package Facade;

//外观模式
public class Client {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.MethodA();
        facade.MethodB();
    }
}
