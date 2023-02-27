import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt().apply(36.0));

    }
    public static UnaryOperator<Double> sqrt(){
        UnaryOperator<Double>sqrt1=x->Math.sqrt(x);
        return sqrt1;
    }
}