package com.company;

@FunctionalInterface
public interface MyFunction {
    boolean test(Animal a);

    //The following methods don`t count in SAM test
    boolean equals(Object object);
    int hashCode();
    String toString();

//    int toString();
}
