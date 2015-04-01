/**
 *  Interface for Function, allowing for higher order
 *  functional programming in Java
 */
public interface Function1<R, P1> {
    /**
     * Lambda of the function 
     * @param type P1
     * @return type R 
     */
    public R lambda(P1 param);
}
