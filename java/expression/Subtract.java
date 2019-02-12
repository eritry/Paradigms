package expression;

public class Subtract extends Operator implements AllExpressions {

    public Subtract(AllExpressions f, AllExpressions s) {
        super(f, s);
    }

    protected int operator(int a, int b) {
        return a - b;
    }

    protected double operator(double a, double b) {
        return a - b;
    }
}
