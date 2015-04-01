/**
 *  Interface for Function, allowing for higher order
 *  functional programming in Java
 */
public interface Function4<R, P1, P2, P3, P4> {
    /**
     * Lambda of the function 
     * @param type P1 P2 P3 P4
     * @return type R 
     */
    public R lambda(P1 param1, P2 param2, P3 param3, P4 param4);
}

