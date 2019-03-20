package Builder;

//建造者模式
public class Client {
    public static void main(String[] args){
        Director director = new Director();
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        ConcreteBuilder2 builder2 = new ConcreteBuilder2();

        director.Construct(builder1);
        director.Construct(builder2);

        Product product1 = builder1.getResult();
        Product product2 = builder2.getResult();

        product1.show();
        product2.show();
    }
}
