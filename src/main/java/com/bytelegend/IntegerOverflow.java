package com.bytelegend;

public class IntegerOverflow {
    public static void main(String[] args) {
        long oneBillion = 1000000000;
        long i = 0;

        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
    }
}
