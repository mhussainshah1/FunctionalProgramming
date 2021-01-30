package com.company;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    //1
    MethodReference(){}
    MethodReference(int a){}

    //2
    public static void staticMethod(){}
    public static void staticMethod(int a){}

    //3
    public void instanceMethod(){}
    public void instanceMethod(int a){}
    public void instanceMethod(int a, int b){}

    public static void main(String[] args) {
        //1 constructor
        Supplier<MethodReference> r11= MethodReference::new; //() -> new MethodReference();
        Function<Integer, MethodReference> r12 = MethodReference::new;//(a) -> new MethodRefence(a)

        //2 static method
        Runnable r21 = MethodReference::staticMethod;
        Consumer<Integer> r2 = MethodReference::staticMethod;

        //3 instance method on particular object
        var obj = new MethodReference();
        Runnable r31 = obj::instanceMethod;
        Consumer<Integer> r32 = obj::instanceMethod;
        BiConsumer<Integer, Integer> r33 = obj::instanceMethod;

        //4 instance method on parameter - put instance in first parameter
        Consumer<MethodReference> r41 = MethodReference::instanceMethod; //obj -> obj.instanceMethod()
        BiConsumer<MethodReference, Integer> r42 = MethodReference::instanceMethod; //(obj , a) -> obj.instanceMethod(a)
    }
}