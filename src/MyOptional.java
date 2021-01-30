import java.util.Optional;

public class MyOptional {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0)
            return Optional.empty();

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average(90, 100));
        System.out.println(average());

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get());

        //or
        opt.ifPresent(System.out::println);

        opt = average();
//        System.out.println(opt.get());//NoSuchElementException

        String value = "";
        Optional o = (value == null) ? Optional.empty() : Optional.of(value);
        //or
        o = Optional.ofNullable(value);

        opt = average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(Math::random));// () -> Math.random()
//        System.out.println(opt.orElseThrow());//NoSuchElementException
//        System.out.println(opt.orElseThrow(IllegalAccessError::new));//() -> new IllegalAccessError()
//        System.out.println(opt.orElseGet(IllegalStateException::new));//Does not compile

        opt = average(90, 100);
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(Math::random));
        System.out.println(opt.orElseThrow());
    }
}
