package commonInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethod {
    public static void main(String[] args) {
        //Predicate
        Predicate<String> egg = str -> str.contains("egg");
        Predicate<String> brown = str -> str.contains("brown");

//        Predicate<String> brownEggs = str -> str.contains("egg") && str.contains("brown");
        Predicate<String> brownEggs = egg.and(brown);
        System.out.println(brownEggs.test("eggbrown"));

//        Predicate<String> otherEggs = str -> str.contains("egg") && !str.contains("brown");
        Predicate<String> otherEggs = egg.and(brown.negate());

        //Consumer
        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.println(",2: " + x);
        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie");

        //Function
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined2 = after.andThen(before);
        System.out.println(combined2.apply(3));//( 3 x 2) +1 = 7

        combined2 = after.compose(before);
        System.out.println(combined2.apply(3));//(3 + 1) x 2 = 8
    }
}
