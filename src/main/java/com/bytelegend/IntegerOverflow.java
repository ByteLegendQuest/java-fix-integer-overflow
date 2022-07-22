package com.bytelegend;

public class IntegerOverflow {
    public static void main(String[] args) {
        Long oneBillion = 1_000_000_000;
        Long i = 0;

        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
    }
}
