package Facade;

public class Facade {
    private SubSystemA a;
    private SubSystemB b;
    private SubSystemC c;
    private SubSystemD d;

    public Facade() {
        a = new SubSystemA();
        b = new SubSystemB();
        c = new SubSystemC();
        d = new SubSystemD();
    }

    /*
    * 方法组A
    * */
    public void MethodA(){
        System.out.println("Method Group A:");
        a.operation();
        b.operation();
        d.operation();
    }

    /*
    * 方法组B
    * */
    public void MethodB(){
        System.out.println("Method Group B:");
        c.operation();
        d.operation();
    }
}
