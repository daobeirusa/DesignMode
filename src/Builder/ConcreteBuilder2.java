package Builder;

public class ConcreteBuilder2 extends Builder{
    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.addPart("组件X");
    }

    @Override
    public void BuildPartB() {
        product.addPart("组件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
