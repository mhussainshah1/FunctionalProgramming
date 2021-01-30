package com.company;

public class AnonymousVsLambda {

    public void instanceMethod(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "Anonymous Inner Class";
            }
        };
        runnable.run();

        runnable = () -> System.out.println(this);
        runnable.run();
    }

    @Override
    public String toString() {
        return "Parent Outer Class";
    }

    public static void main(String[] args) {
        new AnonymousVsLambda().instanceMethod();
    }
}