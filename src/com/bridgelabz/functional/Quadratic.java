package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter values of a,b &c from equation a*x*x+b*x+c : ");
        int a =utility.getIntValue();
        int b =utility.getIntValue();
        int c =utility.getIntValue();
        utility.quadratic(a,b,c);
    }
}
