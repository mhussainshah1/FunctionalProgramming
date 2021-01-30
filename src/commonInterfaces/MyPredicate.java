package commonInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {

        Predicate<String> p1 = String::isEmpty; // str -> str.isEmpty();
        System.out.println(p1.test(""));

        BiPredicate<String,String> b1 = String::startsWith; //(str, prefix) -> str.startsWith(prefix)
        System.out.println(b1.test("chicken","chick"));
    }
}
