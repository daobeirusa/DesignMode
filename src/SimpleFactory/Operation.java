package SimpleFactory;

public abstract class Operation {
    private double _numberA = 0;
    private double _numberB = 0;

    public double getNumberA() {
        return _numberA;
    }

    public void setNumberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double getNumberB() {
        return _numberB;
    }

    public void setNumberB(double _numberB) {
        this._numberB = _numberB;
    }

    /*public double GetResult(){
        double result = 0;
        return  result;
    }*/

    public abstract double getResult() throws Exception;
}
