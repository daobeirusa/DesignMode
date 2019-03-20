package Builder;

public class ConcreteBuilder1 extends Builder{
    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.addPart("组件A");
    }

    @Override
    public void BuildPartB() {
        product.addPart("组件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
