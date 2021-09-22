package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfThreeIs0 {
    public static void main(String[] args) {
        Utility utility=new Utility();
        int m=0;
        System.out.println("Enter Count of numbers :");
        m=utility.getIntValue();
        Integer[]array=utility.getSumOfZero(m);
        utility.printOutput(array,m);
    }
}
