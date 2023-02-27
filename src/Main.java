import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        UnaryOperator<Double>s=x->x*x;
        System.out.println(s.apply(5.0));






        System.out.println(sqrt().apply(36.0));

    }
    public static UnaryOperator<Double> sqrt(){
        UnaryOperator<Double>sqrt1=x->Math.sqrt(x);
        return sqrt1;
    }
}