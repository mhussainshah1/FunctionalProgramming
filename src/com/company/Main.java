package com.company;

public class Main {
    public static void main(String[] args) {

        //in java 7 - anonymous classes
        MyFunction checker = new MyFunction() {
            @Override
            public boolean test(Animal a) {
                return a.isHop();
            }
        };

        //in java 8 -lambda
        /*** Declaration ***/
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

        //in java 11 - Local Variable type inference
        var test =(MyFunction) a ->   a.isHop();

        System.out.println(test);

        /**
         * Execution - object will not be created unless we call the implementation of method
         */
        System.out.println(checker.test(new Animal()));
    }
}
