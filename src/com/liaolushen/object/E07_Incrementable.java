package com.liaolushen.object;

/**
 * Created by liaolushen on 15-11-13.
 */
public class E07_Incrementable {
    public static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        increment();
        System.out.println(StaticTest.i);
        E07_Incrementable incrementable = new E07_Incrementable();
        incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class StaticTest {
    static int i = 0;
}
