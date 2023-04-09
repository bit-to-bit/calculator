package org.java.dev;

import org.java.dev.utils.SumCalculator;

public class App {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println(sumCalculator.sum(3));
    }
}