package chapter7;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("-", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator operator;

    Operation(String symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y) {
        return operator.applyAsDouble(x, y);
    }
    public static void main(String[] args) {
        double x = 11;
        double y = 13;
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}
/*public enum Operation2{
    PLUS("+"){
        public double apply(double x, double y) {return x + y;}
    },
    MINUS("-"){
        public double apply(double x, double y) {return x - y;}
    },
    TIMES("*"){
        public double apply(double x, double y) {return x * y;}
    },
    DIVIDE("-"){
        public double apply(double x, double y) {return x - y;}
    },
}*/