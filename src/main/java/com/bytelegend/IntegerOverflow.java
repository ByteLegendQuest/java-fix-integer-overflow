package com.bytelegend;

public class IntegerOverflow {
    public static void main(String[] args) {
        int oneBillion = 1000000000;
        int i = 0;

        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
    }
}
