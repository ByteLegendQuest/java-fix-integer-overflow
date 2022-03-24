package com.bytelegend;

public class IntegerOverflow {
    public static void main(String[] args) {
        long oneBillion = 1_000_000_000;
        long i = 0;

        i += oneBillion;
        System.out.println("i=" + i);
        i += oneBillion;
        System.out.println("i=" + i);
        i += oneBillion;
        System.out.println("i=" + i);
    }
}
