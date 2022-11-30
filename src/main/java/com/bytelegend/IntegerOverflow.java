package com.bytelegend;

public class IntegerOverflow {
    public static void main(String[] args) {
        int oneBillion = 1_000_000_000;
        int i = 0;

        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
        Long aLong = new Long((long) i);
        Long aLong1 = new Long((long) oneBillion);
        System.out.println("i=" + (aLong + aLong1));
    }
}
