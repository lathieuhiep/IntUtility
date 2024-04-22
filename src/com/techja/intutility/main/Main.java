package com.techja.intutility.main;

import com.techja.intutility.number.IntUtility;

public class Main {
    public static void main(String[] args) {
        IntUtility utility = new IntUtility(10);
        utility.printSumFrom1ToN();
        utility.checkPrime();
    }
}