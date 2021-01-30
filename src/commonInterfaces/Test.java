package commonInterfaces;

import java.util.List;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
/*

        _________<List> ex1 = x -> "".equals(x.get(0));
        _________<Long> ex2 = (Long l) -> System.out.println(l);
        _________<String, String> ex3 = (s1, s2) -> false;
*/
        Predicate<List> ex1 = x -> "".equals(x.get(0));
        Consumer<Long> ex2 = (Long l) -> System.out.println(l);//System.out::println;
        BiPredicate<String, String> ex3 = (s1, s2) -> false;
/*

        Function<List<String>> ex4 = x -> x.get(0); // DOES NOT COMPILE
        UnaryOperator<Long> ex5 = (Long l) -> 3.14; // DOES NOT COMIPLE
        Predicate ex6 = String::isEmpty; // DOES NOT COMPILE
*/

        Function<List<String> , String> ex4 = x -> x.get(0);
        UnaryOperator<Long> ex5 = (Long l) -> 3L;
        Predicate<String> ex6 = String::isEmpty;
    }
}
