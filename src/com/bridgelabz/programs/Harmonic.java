package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Harmonic {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Number : ");
        int number=utility.getIntValue();
        utility.harmonicNumber(number);
    }
}
