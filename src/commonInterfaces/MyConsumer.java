package commonInterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println; // x -> System.out.println(x);
        c1.accept("Annie");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put; // (k,v) -> map(k,v)
        b1.accept("chicken", 7);
        b1.accept("chick" , 1);
        System.out.println(map);
    }
}