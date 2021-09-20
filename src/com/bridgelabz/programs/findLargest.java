package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class findLargest {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter three number : ");
        int a =utility.getIntValue();
        int b =utility.getIntValue();
        int c =utility.getIntValue();
        utility.findLargestofThree(a,b,c);
    }
}
