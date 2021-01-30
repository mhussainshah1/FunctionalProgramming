package com.company;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {

        //in java 7 - anonymous classes
        Predicate<Animal> checker = new Predicate<Animal>() {
            @Override
            public boolean test(Animal a) {
                return a.isHop();
            }
        };

        //in java 8 -lambda
        checker = /*public boolean test*/(Animal a) ->{
            return a.isHop();
        };

        checker = (Animal a) ->{ return a.isHop();};
        checker = (a) ->{ return a.isHop();};
        checker = a -> { return a.isHop();};
        checker = a ->   a.isHop(); //Most Simplified Form
        checker = (a) ->   a.isHop();
        checker = (Animal a) ->   a.isHop();

        // - Method reference
        checker = Animal::isHop;

        //in java 11
        var test =(MyFunction) a ->   a.isHop();

        System.out.println(test);
    }
}
