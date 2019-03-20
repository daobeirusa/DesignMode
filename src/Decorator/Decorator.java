package Decorator;

public class Decorator extends Component {
    protected Component component;

    public  Decorator(){}

    public Decorator(Component component) {
        this.component = component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null){
            component.Operation();
        }
    }
}
