package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class evenOrOdd {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter a number : ");
        int a =utility.getIntValue();
        utility.checkOddOrEven(a);
    }
}
