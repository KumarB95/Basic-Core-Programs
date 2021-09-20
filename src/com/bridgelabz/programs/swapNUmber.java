package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class swapNUmber {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter first number : ");
        int a =utility.getIntValue();
        System.out.println("Enter second number : ");
        int b=utility.getIntValue();
        utility.swapNumbers(a,b);
    }
}
