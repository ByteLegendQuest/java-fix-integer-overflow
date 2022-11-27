package com.bytelegend;

public class IntegerOverflow {
    public static void main(String[] args) {
        BigInteger oneBillion = new BigInteger("1000000000");
        BigInteger i = BigInteger.ZERO;

        i = i.add(oneBillion);
        System.out.println("i=" + i);
        i = i.add(oneBillion);
        System.out.println("i=" + i);
        i = i.add(oneBillion);
        System.out.println("i=" + i);
    }
}
