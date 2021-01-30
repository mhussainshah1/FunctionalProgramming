package commonInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;//() -> LocalDate.now();
        LocalDate d1 = s1.get();
        System.out.println(d1);

        Supplier<StringBuilder> sb1 = StringBuilder::new;//() -> new StringBuilder()
        System.out.println(sb1.get().append("StringBuilder"));

        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
        ArrayList<String> a1 = s3.get();
        a1.add("Collection");
        System.out.println(a1);
    }
}