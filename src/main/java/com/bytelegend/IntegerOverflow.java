package com.bytelegend;

public class IntegerOverflow {
    public static void main(String[] args) {
        lnt oneBillion = 1_000_000_000;
        lnt i = 0;

        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
    }
}
