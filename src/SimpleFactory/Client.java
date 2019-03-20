package SimpleFactory;

//简单工厂模式
public class Client {
    public static void main(String[] args){
        Operation oper;
        oper = OperationFactory.createOperate("/");
        oper.setNumberA(10);
        oper.setNumberB(2);
        double result;
        try {
            result = oper.getResult();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
