package com.company;

import java.util.function.Predicate;

public class Closure {
    private static String staticVariable;
    private String instanceVariable;

    public void instanceMethod(final String parameter) {
        final String localVariable = "local";
        staticVariable ="allowed";

        Predicate<String> p = str -> (instanceVariable + parameter + localVariable + staticVariable).length() == 10;

//        parameter ="not allowed";
//        localVariable ="not allowed";

        staticVariable ="allowed";
        instanceVariable ="allowed";
    }
}
