package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Dividend and Divisor : ");
        int dividend =utility.getIntValue();
        int divisor=utility.getIntValue();
        utility.quotientAndRemainder(dividend,divisor);
    }
}
