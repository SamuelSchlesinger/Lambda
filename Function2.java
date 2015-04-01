/** interface for Function, allowing for higher order
 *  functional programming in Java
 */
public interface Function2<R, P1, P2> {
    /**
     * Lambda of the function 
     * @param type P1 P2
     * @return type R 
     */
    public R lambda(P1 param1, P2 param2);
}

