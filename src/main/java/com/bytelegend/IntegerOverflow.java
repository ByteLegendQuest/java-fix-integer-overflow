package com.bytelegend;
import java.math.BigInteger;
public class IntegerOverflow {
    public static void main(String[] args) {
        int oneBillion = 1_000_000_000;
        int i = 0;

        BigInteger big1, big2;

        i = i + oneBillion;
        System.out.println("i=" + i);
        i = i + oneBillion;
        System.out.println("i=" + i);
        big1 = new BigInteger(Integer.toString(i));
        big2 = new BigInteger(Integer.toString(oneBillion));
        //i = i + oneBillion;
        System.out.println("i=" + big1.add(big2));
    }
}
