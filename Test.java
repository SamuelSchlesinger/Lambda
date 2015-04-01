/**
 * Test client for Function interface
 */ 
public class Test {

    private static Function1<Integer, Integer> square = new Function1<Integer, Integer>() {
        public Integer lambda(Integer param) {
            return param * param;
        }
    };

    public static void main(String[] args) {
        System.out.println(square.lambda(1));
    }
}
